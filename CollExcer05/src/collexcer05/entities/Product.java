/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer05.entities;

/**
 *
 * @author blue_
 */
public class Product {
    
    private String _item;
    private Double _price;

    public Product() {
    }

    public Product(String _item, Double _price) {
        this._item = _item;
        this._price = _price;
    }

    public void setItem(String _item) {
        this._item = _item;
    }

    public void setPrice(Double _price) {
        this._price = _price;
    }

    public String getItem() {
        return _item;
    }

    public Double getPrice() {
        return _price;
    }

    @Override
    public String toString() {
        return "Product{" + "_item=" + _item + ", _price=" + _price + '}';
    }
    
    
    
    
}
