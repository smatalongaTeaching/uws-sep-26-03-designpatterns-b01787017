package com.uws.designpatterns.creational.singleton;

import java.util.ArrayList;


public class DatabaseManager implements Strategy 
{
   
    private static DatabaseManager obj; 
    
    private DatabaseManager(){}  
   
    public static DatabaseManager getInstance()
    {  
        if (obj == null)
            obj = new DatabaseManager();
        
        return obj;  
    }      
    
    
    
    
   
    @Override
    public ArrayList<Product> getProductsList()
    {
        //Making different products for each strategy, so it clarifies which strategy is called. Its 
        //just a simulation so no real data is fetched from the database.
        
        ArrayList<Product> products = new ArrayList();
        
        products.add(new Product(10,"Mobile",50000));
        products.add(new Product(11,"Laptop",60000));
        products.add(new Product(12,"PC",70000));
        
        return products;        
    }    
}
