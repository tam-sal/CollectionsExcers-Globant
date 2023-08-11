/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer03.utils;

import collexcer03.entities.Movie;
import java.util.Comparator;

/**
 *
 * @author blue_
 */
public class Comparators {
    
    public static Comparator<Movie> orderDurationDesc = new Comparator<Movie>() {
        @Override
        public int compare(Movie m1, Movie m2){
            return m2.getDuration().compareTo(m1.getDuration());
        }
    };
    
    public static Comparator<Movie> orderDurationAsc = new Comparator<Movie>(){
        @Override
        public int compare(Movie m1, Movie m2){
            return m1.getDuration().compareTo(m2.getDuration());
        }
    };
    
    public static Comparator<Movie> orderByTitle = new Comparator<Movie>(){
        @Override
        public int compare(Movie m1, Movie m2){
            return m1.getTitle().compareTo(m2.getTitle());
        }
    };
    
    public static Comparator<Movie> orderByDirector = new Comparator<Movie>(){
        @Override
        public int compare(Movie m1, Movie m2){
            return m1.getDirector().compareTo(m2.getDirector());
        }
    };
    
}
