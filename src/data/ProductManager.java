package data;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import data.models.Product;

public class ProductManager {
    private String pathFile_two;
    private ArrayList<Product> products;
    public ProductManager(String pathfile_two) {
        this.pathFile_two = pathfile_two;
        this.products = new ArrayList<>();
    }
    public String getPathDirectory() {
        return pathFile_two;
    }
    public void setPathDirectory(String pathDirectory) {
        this.pathFile_two = pathDirectory;
    }
    public ArrayList<Product> getProducts() {
        this.products = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(this.pathFile_two))) {
            String line = reader.readLine();
            while(line != null) {
                String[] data = line.split(",");
                Product product = new Product(data[0], data[1], data[2], data[3]);
                this.products.add(product);
                line = reader.readLine();
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return this.products;
    }
    
    public void saveInOneShot() {
        String allData = "";
        for (Product product : this.products) {
            allData += product.toString() + "\n";
        }
        saveFileLines(allData);
    }
    public void saveProduct(Product product) {
        getProducts();
        this.products.add(product);
        saveInOneShot();
    }
    public void saveFileLines(String allData) {
        try {
            FileWriter writer = new FileWriter(this.pathFile_two);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(allData);
            buffer.newLine();
            buffer.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
