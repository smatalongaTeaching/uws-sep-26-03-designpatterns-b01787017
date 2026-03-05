
package com.uws.designpatterns.creational.singleton;

import java.util.ArrayList;


/*
 * NetworkManager is a Singleton class responsible for retrieving
 * products from a simulated network/server source.
 *
 * The Singleton pattern ensures that only one instance of the
 * NetworkManager exists during program execution.
 *
 * This class implements the Strategy interface and represents
 * the strategy used when the application has internet connectivity.
 *
 * The getProductsList() method returns a simulated list of products
 * that would normally come from a remote server.
 */



public class NetworkManager implements Strategy 
{
    
    private static NetworkManager obj; 
    
    private NetworkManager(){}  
   
    public static NetworkManager getInstance()
    {  
        if (obj == null)
            obj = new NetworkManager();
        
        return obj;  
    }      
   
    @Override
    public ArrayList<Product> getProductsList()
    {
               
        ArrayList<Product> products = new ArrayList();
        
        products.add(new Product(1,"TV",1000));
        products.add(new Product(2,"AC",20000));
        products.add(new Product(3,"Microwave",3000));
        
        return products;        
    }
    
}
