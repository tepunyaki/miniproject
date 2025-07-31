package Lib;

import java.util.ArrayList;

public class ProductCatalog {
    private ArrayList<Product>products = new ArrayList<>();
    //RI : products list is not null , contains no null  elements , 
    //AF : AF(products) = A catalog of all avilable product.

    private void checkRep(){
        if (products == null) {
            throw new RuntimeException("RI violated : product cannot be blank");
        }
        //Check for duplicate product 
        for (int i = 0 ; i < products.size(); i++){
            for(int j = i + 1 ; j < products.size(); j++){
            if(products.get(i).equals(products.get(j))){
                throw new RuntimeException("RI violated : product cannot be blank");
            }
            
            }
        }
    }
}
