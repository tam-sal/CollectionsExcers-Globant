/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer05.services;

import collexcer05.entities.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author blue_
 */
public class ProductService {

    private final HashMap<String, Double> _products = new HashMap();

    public Product createProduct(String item, Double price) {
        return new Product(item, price);
    }

    public void addProduct(String item, Double price) {
        Product p = createProduct(item, price);
        _products.put(p.getItem(), p.getPrice());
    }

    public boolean findProduct(String item) {
        if (!_products.isEmpty()) {
            if (_products.containsKey(item)) {
                System.out.println(item +" found in store");
                return true;
            } else {
                System.out.println("Product not found");
                return false;
            }
        }
        System.out.println("Empty Map");
        return false;
    }

    public void modifyPrice(String item, Double price) {
        if (findProduct(item)) {
            for (Map.Entry<String, Double> p : _products.entrySet()) {
                if (p.getKey().equalsIgnoreCase(item)) {
                    p.setValue(price);
                    break;
                }
            }
        }
    }
    
    public void removeProduct(String item){
        if(findProduct(item)){
           _products.remove(item);
            System.out.println(item + " has been successfully removed from the store");
        }
    }
    
    public void displayStore(){
        _products.entrySet().forEach((p) -> {
            System.out.println("Product: "+p.getKey()+" Price: "+p.getValue());
        });
    }

}
