package com.company.day20.store;

public class OnSaleItems extends Items {

  private double discount;

    public OnSaleItems(String name, int catalogId, int quantity, double price, double discount) {
        super(name, catalogId, quantity, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OnSaleItems{" +
                "\ndiscount=" + discount +"%"+
                "\nItem name"+ getName()+
                "\nItem price" + getPrice()+"$"+
                '}';
    }
}
