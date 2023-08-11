/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer04.entities;

/**
 *
 * @author blue_
 */
public class Country {
    private String _name;

    public Country() {
    }

    public Country(String _name) {
        this._name = _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    @Override
    public String toString() {
        return "Country{" + "_name=" + _name + '}';
    }
    
    
    
}
