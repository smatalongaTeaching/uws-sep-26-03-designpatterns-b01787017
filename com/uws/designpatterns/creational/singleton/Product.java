package com.uws.designpatterns.creational.singleton;


/*
 * Product represents a simple data model for items that can be purchased.
 *
 * Each product has:
 * - an ID
 * - a name
 * - a price
 *
 * Objects of this class are created by the different strategies
 * (NetworkManager and DatabaseManager) when generating product lists.
 */




public class Product 
{
    private int id;
    private String name;
    private int price;
    
    public Product(int i, String n, int p)
    {
        this.id = i;
        this.name = n;
        this.price = p;               
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getName()
    {
        return name;
    }    
}
