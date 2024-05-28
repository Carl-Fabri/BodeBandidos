
package model;


public class Product {
    private String Name;
    private String Category;
    private String mark;
    private double price;

    public Product() {
    }

    public Product(String Name, String Category, String mark, double price) {
        this.Name = Name;
        this.Category = Category;
        this.mark = mark;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    


    
    
    
    
    
    
}
