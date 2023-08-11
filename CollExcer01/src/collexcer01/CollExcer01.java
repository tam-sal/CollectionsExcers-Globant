/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer01;

import collexcer01.services.RaceService;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class CollExcer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final Scanner input = new Scanner(System.in).useDelimiter("\n");
        RaceService rs = new RaceService();

        int res = 0;
        String menu = "Press:\n"
                + "1 to create a race\n"
                + "2 to display races\n"
                + "3 to look for a specific race\n"
                + "4 to delete a race\n"
                + "5 to exit.";

        while (res != 5) {
            System.out.println(menu);
            res = input.nextInt();
            switch (res) {
                case 1:
                    rs.addRace(input.next());
                    break;

                case 2:
                    System.out.println("Current races:");
                    System.out.println(rs.displayRaces().toString());
                    break;

                case 3:
                    System.out.println("Enter the race to search for");
                    rs.findRace(input.next());
                    break;

                case 4:
                    System.out.println("Enter the race to delete");
                    rs.deleteRace(input.next());
                    rs.displayOrdered();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

}
