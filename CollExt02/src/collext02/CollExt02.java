/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext02;

import collext02.services.SingerService;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExt02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        SingerService ss = new SingerService();
        int userInput = -1;
        String name;
        String album;
        String menu = "Press:\n1. Add singer\n2. Display Singer/s\n3. Delete Singer\n0. Exit";
        while(userInput != 0){
            System.out.println(menu);
            userInput = input.nextInt();
            switch(userInput){
                case 1:
                    System.out.println("Enter singer's name");
                    name = input.next();
                    System.out.println("Enter siner's best selling album");
                    album = input.next();
                    ss.addSinger(name, album);
                    break;
                
                case 2:
                    ss.displaySingers();
                    break;
                    
                case 3:
                    System.out.println("Enter a singer's name to delete");
                    name = input.next();
                    ss.deleteSinger(name);
                    break;
                
                case 0:
                    ss.displaySingers();
                    break;
                    
                default:
                    System.out.println("invalid input");
                    break;
            }
            
        }
        
    }
    
}
