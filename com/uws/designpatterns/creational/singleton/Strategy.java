package com.uws.designpatterns.creational.singleton;

import java.util.ArrayList;


/*
 * Strategy is an interface used to define a common method for
 * retrieving a list of products.
 *
 * Different implementations of this interface provide different
 * ways of fetching the product list.
 *
 * In this application there are two strategies:
 * - NetworkManager (fetch products from server)
 * - DatabaseManager (fetch products from database)
 */


public interface Strategy 
{
    public ArrayList<Product> getProductsList();
}
