/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer03;

import collexcer03.services.MovieService;

/**
 *
 * @author blue_
 */
public class CollExcer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MovieService ms = new MovieService();
        ms.addMovies();
        System.out.println("By ordered title:\n******************");
        ms.getOrderedByTitle();
        System.out.println("Duration Ascending:\n******************");
        ms.getDurationAsc();
        System.out.println("By director:\n******************");
        ms.getOrderedByDirector();
        System.out.println("Duration Desc:\n******************");
        ms.getDurationDesc();
        System.out.println("Long movies:\n******************");
        ms.getLongMovies();
        System.out.println("Diplay original:\n******************");
        ms.displayMovies();
        
    }
    
}
