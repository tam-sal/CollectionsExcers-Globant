/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExt01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> nums = new ArrayList();
        int userInput = 0;
        int sum = 0;
        double median = 0.0;
        while(userInput != -99){
            System.out.println("Enter a number: ");
            userInput = input.nextInt();
            if(userInput != -99){
                sum += userInput;
                nums.add(userInput);
            }
            
        }
        // Functional:
        int sum2 = nums.stream().mapToInt(Integer::intValue).sum();
        if(!nums.isEmpty()){
            median = sum2 / nums.size();
            System.out.println("The number of items in list is:\n"+nums.size()+"\nThe median is: "+median);
        }
        else{
            System.out.println("Empty list");
        }
    }
    
}
