package com.company.day20.store;

public class Items {

    private String name;
    private int catalogId;
    private int quantity;
    private double price;

    public Items(String name, int catalogId, int quantity, double price) {
        this.name = name;
        this.catalogId = catalogId;
        this.quantity = quantity;
        this.price = price;
    }
    public Items(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", catalogId=" + catalogId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
