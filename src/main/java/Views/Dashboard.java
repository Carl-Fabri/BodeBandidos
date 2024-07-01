/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import static Views.DashboardProducts.cardLayout;
import Views.procesos.OrderPanel;
import Views.mantenimientos.ProductPanel;
import Views.mantenimientos.CategoriesPanel;
import Views.mantenimientos.MantenimientosPreview;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.print.attribute.standard.PresentationDirection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Fabricio
 */
public class Dashboard extends javax.swing.JFrame implements DashboardInterface{

    private CardLayout cardLayout;
    
    /**
     * Creates new form DashboardProductos
     */
    public Dashboard() {
        cardLayout = new CardLayout();
        initComponents();
        JPanel inicioPanel = new Principal();
        
        cardLayout = (CardLayout)panContent.getLayout();
        
        //Estas vista se visualizan solo si existe es un administrador
        JPanel mantenimientosPanel = new MantenimientosPreview(this);
        JPanel productPanel = new ProductPanel(this);
        JPanel categoriesPanel = new CategoriesPanel(this);
        JPanel customersPanel = new CustomersPanel();
        JPanel orderPanel = new OrderPanel();
        
        panContent.add(inicioPanel, "Inicio");
        panContent.add(mantenimientosPanel, "Mantenimientos");
        panContent.add(productPanel, "Productos");
        panContent.add(customersPanel, "Usuarios");
        panContent.add(categoriesPanel, "Categorias");
        panContent.add(orderPanel, "Ordenes");
        
        
        initContet();
    }
    
    private void initContet() {
        switchPanel("Inicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        panMenu = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnMantenimientos = new javax.swing.JButton();
        btnOrdersPan = new javax.swing.JButton();
        btnProcesos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPrincipalPan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panContent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 400));

        panBackground.setBackground(new java.awt.Color(255, 255, 255));

        panMenu.setBackground(new java.awt.Color(255, 0, 0));
        panMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(new java.awt.Color(255, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-ico.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(10);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        panMenu.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 271, 51));
        panMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 106, 237, -1));

        btnMantenimientos.setBackground(new java.awt.Color(255, 0, 0));
        btnMantenimientos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMantenimientos.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-product-30.png"))); // NOI18N
        btnMantenimientos.setText("Mantenimientos");
        btnMantenimientos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnMantenimientos.setBorderPainted(false);
        btnMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMantenimientos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMantenimientos.setIconTextGap(10);
        btnMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientosActionPerformed(evt);
            }
        });
        panMenu.add(btnMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 271, 51));

        btnOrdersPan.setBackground(new java.awt.Color(255, 0, 0));
        btnOrdersPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrdersPan.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdersPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order-ico.png"))); // NOI18N
        btnOrdersPan.setText("Ordenes");
        btnOrdersPan.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnOrdersPan.setBorderPainted(false);
        btnOrdersPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdersPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrdersPan.setIconTextGap(10);
        btnOrdersPan.setMaximumSize(new java.awt.Dimension(135, 70));
        btnOrdersPan.setMinimumSize(new java.awt.Dimension(135, 70));
        btnOrdersPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersPanActionPerformed(evt);
            }
        });
        panMenu.add(btnOrdersPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 271, 50));

        btnProcesos.setBackground(new java.awt.Color(255, 0, 0));
        btnProcesos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcesos.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categoryico.png"))); // NOI18N
        btnProcesos.setText("Procesos");
        btnProcesos.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnProcesos.setBorderPainted(false);
        btnProcesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProcesos.setIconTextGap(10);
        btnProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesosActionPerformed(evt);
            }
        });
        panMenu.add(btnProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 271, 51));

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BodeBandidos S.A.C");
        panMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 51, 214, 43));

        btnPrincipalPan.setBackground(new java.awt.Color(255, 0, 0));
        btnPrincipalPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrincipalPan.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-ico.png"))); // NOI18N
        btnPrincipalPan.setText("Inicio");
        btnPrincipalPan.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnPrincipalPan.setBorderPainted(false);
        btnPrincipalPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipalPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipalPan.setIconTextGap(10);
        btnPrincipalPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalPanActionPerformed(evt);
            }
        });
        panMenu.add(btnPrincipalPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 271, 51));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 351));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administracion BodeBandidos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 277, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hoy es (dia) (numero del dia) de (mes) del año (año)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 46, 648, 29));

        panContent.setBackground(new java.awt.Color(255, 255, 255));
        panContent.setRequestFocusEnabled(false);
        panContent.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jLabel4.setText("¡Bienvenido de vuelta!");

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        switchPanel("Usuarios");
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnOrdersPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersPanActionPerformed
        switchPanel("Ordenes");
    }//GEN-LAST:event_btnOrdersPanActionPerformed

    private void btnMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientosActionPerformed
        switchPanel("Mantenimientos");
    }//GEN-LAST:event_btnMantenimientosActionPerformed

    private void btnProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesosActionPerformed
        //switchPanel("Mantenimientos");
    }//GEN-LAST:event_btnProcesosActionPerformed

    private void btnPrincipalPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalPanActionPerformed
        switchPanel("Inicio");
    }//GEN-LAST:event_btnPrincipalPanActionPerformed

    @Override    
    public void switchPanel(String panelName) {
        cardLayout.show(panContent, panelName);
    }

    /*    
        public void ShowJPanel(JPanel p){
            p.setSize(000, 400);
            p.setLocation(0,0);

            panContent.removeAll();
            panContent.add(p, BorderLayout.CENTER);
            panContent.revalidate();
            panContent.repaint();   
        }
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantenimientos;
    private javax.swing.JButton btnOrdersPan;
    private javax.swing.JButton btnPrincipalPan;
    private javax.swing.JButton btnProcesos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables

}
