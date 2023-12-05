package ui.custom.grid.table;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import data.models.Product;

public class ProductTableModel extends AbstractTableModel{
    private ArrayList<Product> products;
    private String[] columns = {"Name_pro", "descripcion", "type", "price"};
    public ProductTableModel(ArrayList<Product> products) {
        this.products = products;
    }
    public void addRow(Product user) {
        this.products.add(user);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.products.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = this.products.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getname_pro();
            case 1:
                return product.getdescripcion();
            case 2:
                return product.gettype();
            case 3:
                return product.getprice();
            default:
                return null;
        }
    }
    
}
