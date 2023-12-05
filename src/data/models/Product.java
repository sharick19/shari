package data.models;

public class Product {
    private String name_pro;
    private String descripcion;
    private String type;
    private String price;
    public Product(String name_pro, String descripcion, String type, String price) {
        this.name_pro = name_pro;
        this.descripcion = descripcion;
        this.type = type;
        this.price = price;
    }

    public String getname_pro() {
        return name_pro;
    }
    public void setname_pro(String name_pro) {
        this.name_pro = name_pro;
    }
    public String getdescripcion() {
        return descripcion;
    }
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }
    public String getprice() {
        return price;
    }
    public void setprice(String price) {
        this.price = price;
    }
    // methods
    @Override
    public String toString() {
        return this.name_pro + "," + this.descripcion + "," + this.type + "," + this.price;
    }
    
}
