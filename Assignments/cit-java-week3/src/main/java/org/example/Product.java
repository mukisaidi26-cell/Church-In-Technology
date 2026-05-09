package org.example;

public class Product {
    String name;
    double price;
    int stockQuantity;
    String category;

    //Product constructor
    public Product(String name, double price, int stockQuantity, String category) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }
    //display info method
    void displayInfo() {
        System.out.println("Product: " + name + " | Price: UGX " + price + " | Stock: " + stockQuantity + " | Category: " + category);
    }

    //restock method
    void restock(int units) {
        stockQuantity += units;
        System.out.println("Restocked " + name + " by " + units + " units " + "New stack: " + stockQuantity);
    }

    //isInstock method
    boolean isInStock() {
        return  stockQuantity > 0;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 100000.0, 100, "Electronics");
        Product p2 = new Product("Shirt", 20000.0, 100, "Clothing");

        p1.displayInfo();
        p1.restock(5);
        System.out.println("InStock: " + p1.isInStock());
        System.out.println();

        p2.displayInfo();
        p2.restock(10);
        System.out.println("Instock: " + p2.isInStock());
        System.out.println();
    }
}