/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer04.services;

import collexcer04.entities.Country;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author blue_
 */
public class CountryService {

    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    private final HashSet<String> _countries = new HashSet();

    public Country createCountry() {
        Country c = new Country();
        System.out.println("Enter country name");
        c.setName(_input.next().toLowerCase());
        return c;
    }

    public void addCountry() {
        Country c = createCountry();
        _countries.add(c.getName());
    }

    public HashSet<String> getCountries() {
        if (_countries.isEmpty()) {
            return null;
        }
        return _countries;
    }

    public void displayCountries() {
        if (_countries.isEmpty()) {
            System.out.println("Empty Set");
        } else {
            _countries.forEach((c) -> {
                System.out.println(c);
            });
        }
    }

    public void removeCountry(String name) {
        
        boolean isFound = _countries.contains(name.toLowerCase());
        if (isFound) {
            _countries.remove(name.toLowerCase());
            System.out.println(name +" has been successfully removed.");
        } else {
            System.out.println(name + " not found in the current list");
        }
    }
    
    public Set<String> getAlphaOrdered(){
        Set<String> orderedCountries = new TreeSet(_countries);
        return orderedCountries;
    }

}
