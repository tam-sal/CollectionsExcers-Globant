/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer05;

import collexcer05.services.ProductService;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExcer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner input = new Scanner(System.in).useDelimiter("\n");
        ProductService ps = new ProductService();
        String product;
        Double price;
        int res = -1;
        String menu = "Press:\n"
                + "1. display store\n"
                + "2. add product\n"
                + "3. find product\n"
                + "4. modify product's price\n"
                + "5. delete product\n"
                + "6. exit";

        while (res != 6) {
            System.out.println(menu);
            res = input.nextInt();
            switch (res) {
                case 1:
                    System.out.println("\n*** Store ***\n");
                    ps.displayStore();
                    break;
                    
                case 2:
                    System.out.println("Add the product and price");
                    product = input.next();
                    price = input.nextDouble();
                    ps.addProduct(product.toLowerCase(), price);
                    break;
                    
                case 3:
                    System.out.println("Enter the product you're looking for");
                    product = input.next();
                    ps.findProduct(product);
                    break;
                
                case 4:
                    System.out.println("Enter the product to modify its price");
                    product = input.next().toLowerCase();
                    System.out.println("Enter the updated price for that product");
                    price = input.nextDouble();
                    ps.modifyPrice(product, price);
                    break;
                
                case 5:
                    System.out.println("Enter the product you want to remove from store");
                    product = input.next().toLowerCase();
                    ps.removeProduct(product);
                    break;
                
                case 6:
                    System.out.println("Exiting the system..");
                    break;
                    
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

    }

}
