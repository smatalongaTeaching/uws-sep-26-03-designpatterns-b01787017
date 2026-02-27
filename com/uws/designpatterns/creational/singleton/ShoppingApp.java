package com.uws.designpatterns.creational.singleton;

import java.util.ArrayList;


public class ShoppingApp 
{
    Strategy strategy;

    
    private static ShoppingApp obj; 
    
    private ShoppingApp(){}  
   
    public static ShoppingApp getInstance()
    {  
        if (obj == null)
            obj = new ShoppingApp();
        
        return obj;  
    }      
   
       
    public ArrayList<Product> doShopping(boolean connectivity)
    {
        if (connectivity)
            strategy = NetworkManager.getInstance();
        else
            strategy = DatabaseManager.getInstance();
        
        return strategy.getProductsList();
    }
}
