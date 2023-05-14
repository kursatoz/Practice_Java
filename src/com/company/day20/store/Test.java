package com.company.day20.store;

public class Test {
    public static void main(String[] args) {


        Items it1 = new Items("Iphone",0001,1,1360.00);
        OnSaleItems onSaleItem1 = new OnSaleItems("Iphone13x",0002,2,1402.00,10);
        Action act = new Action();
        act.addNormalItems(it1);
        act.addOnsaleItem(onSaleItem1);
        act.saleItemById(0001);
        System.out.println(act.getByCatalogId(0001));


    }
}
