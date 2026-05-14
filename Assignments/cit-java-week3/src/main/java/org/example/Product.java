package org.example;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String category;

    //Product constructor
    public Product() {

    }
    public Product(String name, double price, int stockQuantity, String category) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }
    //display info method
    void displayInfo() {
        String message = "Product: " + name  + "\n | Price: UGX " + price + "\n | Stock: " + stockQuantity + "\n | Category: " + category;
        displayInfo(message);
    }
    void displayInfo(String message) {
        System.out.println(message);
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
    public String getStatus() {
        return "The class is active";
    }

    /*public static void main(String[] args) {
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
    } */
    public String getName() {
        return name;
    }

}

