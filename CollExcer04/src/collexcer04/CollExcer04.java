/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer04;

import collexcer04.services.CountryService;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExcer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner input = new Scanner(System.in).useDelimiter("\n");
        CountryService cs = new CountryService();
        String res = "";
        while(!res.equalsIgnoreCase("x")){
            System.out.println("Press [y] to add a new country | [x] to exit");
            res = input.next();
            if(res.equalsIgnoreCase("y")){
                cs.addCountry();
            }
        }
        System.out.println("Set: \n"+cs.getCountries().toString());
        cs.displayCountries();
        System.out.println("Enter a country name to remove:");
        cs.removeCountry(input.next());
        System.out.println("Ordered Countries:\n"+cs.getAlphaOrdered());
        
        
    
    }
    
}
