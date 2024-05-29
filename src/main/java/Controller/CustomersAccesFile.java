/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Clientes;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Fabricio
 */
public class CustomersAccesFile {
    RandomAccessFile flujo;
    int countRegisters;
    int tamRegistro = 190; 
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public void openFile(String archive) throws IOException
    {
        flujo = new RandomAccessFile(archive,"rw");
        // ceil redondea al entero superior : ceil(2.9) --> 2, ceil(2.1) --> 2 
        countRegisters = (int)Math.ceil((double)flujo.length()/(double)tamRegistro);
    }   
    
    public void closeFile() throws IOException
    {
        flujo.close();
    }
    
    public int getCountRegister()
    {
        return countRegisters;
    }
    
    public void addCustomer(Clientes customer) throws IOException
    {
        flujo.seek(countRegisters*tamRegistro);
        flujo.writeInt(customer.getId());
        flujo.writeUTF(customer.getNombre());
        flujo.writeUTF(customer.getApellido());
        flujo.writeUTF(customer.getDireccion());
        flujo.writeUTF(customer.getCorreo());
        flujo.writeUTF(customer.getSexo());
        flujo.writeUTF(customer.getFechadenacimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        flujo.writeInt(customer.getDnioruc());
        flujo.writeInt(customer.getTelefono());
        flujo.writeUTF(customer.getFechaactu().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        flujo.writeUTF(customer.getFechacrea().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        countRegisters++;
    }
    
    public void updateCustomer(int i, Clientes cliente) throws IOException {
        flujo.seek(i*tamRegistro);

        flujo.writeInt(cliente.getId());
        flujo.writeUTF(cliente.getNombre());
        flujo.writeUTF(cliente.getApellido());
        flujo.writeUTF(cliente.getDireccion());
        flujo.writeUTF(cliente.getCorreo());
        flujo.writeUTF(cliente.getSexo());
        flujo.writeUTF(cliente.getFechadenacimiento().format(DATE_FORMATTER));
        flujo.writeInt(cliente.getDnioruc());
        flujo.writeInt(cliente.getTelefono());
        flujo.writeUTF(cliente.getFechaactu().format(DATE_FORMATTER));
        flujo.writeUTF(cliente.getFechacrea().format(DATE_FORMATTER));
    }    
    
    public void deleteCustomer(int index) throws IOException {
        flujo.seek(index*tamRegistro);

        // Marcar el registro como eliminado, por ejemplo, estableciendo el ID en -1
        flujo.writeInt(-1);
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeInt(0);
        flujo.writeInt(0);
        flujo.writeUTF(String.format("%-20s", ""));
        flujo.writeUTF(String.format("%-20s", ""));
    }
    
    public Clientes obtenerUnEmpleado(int i) throws IOException
    {
        flujo.seek(i*tamRegistro);

        int id = flujo.readInt();
        String nombre = flujo.readUTF().trim();
        String apellido = flujo.readUTF().trim();
        String direccion = flujo.readUTF().trim();
        String correo = flujo.readUTF().trim();
        String sexo = flujo.readUTF().trim();
             LocalDate fechadenacimiento = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);
        int dnioruc = flujo.readInt();
        int telefono = flujo.readInt();
        LocalDate fechaactu = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);
        LocalDate fechacrea = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);

        return new Clientes(nombre, apellido, direccion, correo, sexo, id, fechadenacimiento, dnioruc, telefono, fechaactu, fechacrea);     
    }

    public int getNumRegistros()
    {
        return countRegisters;
    }

    public Clientes obtenerUnCliente(int index) throws IOException {
        flujo.seek(index * tamRegistro);

        int id = flujo.readInt();
        String nombre = flujo.readUTF().trim();
        String apellido = flujo.readUTF().trim();
        String direccion = flujo.readUTF().trim();
        String correo = flujo.readUTF().trim();
        String sexo = flujo.readUTF().trim();
        LocalDate fechadenacimiento = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);
        int dnioruc = flujo.readInt();
        int telefono = flujo.readInt();
        LocalDate fechaactu = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);
        LocalDate fechacrea = LocalDate.parse(flujo.readUTF().trim(), DATE_FORMATTER);

        return new Clientes(nombre, apellido, direccion, correo, sexo, id, fechadenacimiento, dnioruc, telefono, fechaactu, fechacrea);
    }

    public List<Clientes> getClientesList() throws IOException {
        List<Clientes> clientes = new ArrayList<>();
        
            for (int i = 0; i < getNumRegistros(); ++i) {
                flujo.seek(i * tamRegistro);
                Clientes cliente = obtenerUnCliente(i);
                clientes.add(cliente);
            }
        
        return clientes;
    }
    
    

}
