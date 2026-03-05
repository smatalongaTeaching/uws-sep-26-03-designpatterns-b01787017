package com.uws.designpatterns.creational.singleton;

import java.util.ArrayList;



/*
 * ShoppingApp is the main application controller and is implemented
 * as a Singleton so that only one instance of the shopping application
 * exists in the system.
 *
 * The class uses the Strategy pattern to decide how products should
 * be retrieved depending on internet connectivity.
 *
 * If connectivity is available, the NetworkManager strategy is used.
 * If connectivity is not available, the DatabaseManager strategy is used.
 *
 * The doShopping() method selects the appropriate strategy and
 * returns the list of products.
 */



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
