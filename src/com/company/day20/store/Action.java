package com.company.day20.store;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Action {

     List <Items> normalItem ;
     List <OnSaleItems> onSaleItem;

    public Action(){
        this.normalItem = new ArrayList<Items>();
        this.onSaleItem = new ArrayList<OnSaleItems>();
    }

    public void addNormalItems(Items it){
             normalItem.add(it);
     }
     public void addOnsaleItem(OnSaleItems it){
             onSaleItem.add(it);
     }

     public List<Items> getNormalItem(){
        return normalItem;
     }

     public List<OnSaleItems> getOnSaleItem(){
        return onSaleItem;
     }

     public String getByCatalogId(int id){

         for (Items each : normalItem ) {
             if (each.getCatalogId() == id)
                 return each.toString();
         }
         for (OnSaleItems each : onSaleItem) {
             if (each.getCatalogId() ==  id)
                 return each.toString();
         }

        return "We could find items buy the "+ id +" number";
     }

     public void saleItemByName(String name){
         for (Items each: normalItem) {
            if(each.getName().equalsIgnoreCase(name))
            {
                each.setQuantity(each.getQuantity()-1);

            }
            if (each.getQuantity() == 0)
                normalItem.remove(each);

         }
         for (Items each: onSaleItem) {
             if(each.getName().equalsIgnoreCase(name))
             {
                 each.setQuantity(each.getQuantity()-1);

             }
             if (each.getQuantity() == 0)
                 onSaleItem.remove(each);
         }

     }

     public void saleItemById(int catalogId){
         for (int i = 0; i <normalItem.size() ; i++) {
            if (normalItem.get(i).getCatalogId() == catalogId){
                normalItem.get(i).setCatalogId(normalItem.get(i).getQuantity()-1);
            }if (normalItem.get(i).getQuantity() == 0)
                normalItem.remove(normalItem.get(i));
         }

     }

     public List<String> getAllItemsName(){
        List<String> allName = new ArrayList<String>();
         for (Items each : normalItem) {
              allName.add(each.getName());
         }

         for (OnSaleItems each : onSaleItem ) {
              allName.add(each.getName());
         }

         return allName;
     }




}
