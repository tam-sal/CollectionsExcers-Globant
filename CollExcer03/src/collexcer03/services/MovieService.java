/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer03.services;

import collexcer03.entities.Movie;
import collexcer03.utils.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author blue_
 */
public class MovieService {

    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Movie> _movies = new ArrayList();

    public Movie createMovie() {
        Movie m = new Movie();
        System.out.println("Enter movie title");
        m.setTitle(_input.next().toLowerCase());
        System.out.println("Enter movie director");
        m.setDirector(_input.next().toLowerCase());
        System.out.println("Enter movie duration");
        m.setDuration(_input.nextInt());
        return m;
    }

    public ArrayList<Movie> addMovies() {
        String res = "";
        while (!res.equalsIgnoreCase("x")) {
            System.out.println("Press [y] to create movie | [x] to exit");
            res = _input.next();
            if (res.equalsIgnoreCase("y")) {
                Movie m = createMovie();
                _movies.add(m);
            }
        }
        displayMovies();
        return _movies;
    }

    public boolean checkMoviesSize() {
        if (_movies.isEmpty()) {
            System.out.println("Movies list is empty");
            return false;
        }
        return true;
    }

    public ArrayList<Movie> getMovies() {
        if (checkMoviesSize()) {
            return _movies;
        }
        return null;
    }

    public void displayMovies() {
        if (checkMoviesSize()) {
            _movies.forEach((mov) -> {
                System.out.println(mov.toString());
            });
        }
    }
    
    public void generalDisplay(ArrayList<Movie> ms){
        ms.forEach(m->System.out.println(
                "Title: "+m.getTitle()
                +"\nDirector: "+m.getDirector()
                +"\nDuration: "+m.getDuration()
        ));
    }
    
    public ArrayList<Movie> getOrderedByTitle(){
        if(checkMoviesSize()){
            ArrayList<Movie> sortedByTitle = new ArrayList(_movies);
            sortedByTitle.sort(Comparators.orderByTitle);
            generalDisplay(sortedByTitle);
            return sortedByTitle;
        }
        return null;
    }
    
    public ArrayList<Movie> getOrderedByDirector(){
        if(checkMoviesSize()){
            ArrayList<Movie> sortedByDirector = new ArrayList(_movies);
            sortedByDirector.sort(Comparators.orderByDirector);
            generalDisplay(sortedByDirector);
            return sortedByDirector;
        }
        return null;
    }

    public ArrayList<Movie> getLongMovies() {
        if (checkMoviesSize()) {
            List<Movie> longMoviesList = _movies.stream().filter(mov -> mov.getDuration() > 1).collect(Collectors.toList());
            ArrayList<Movie> longMovies = new ArrayList(longMoviesList);
            generalDisplay(longMovies);
            return longMovies;
        }
        return null;
    }

    public ArrayList<Movie> getDurationDesc() {
        if (checkMoviesSize()) {
            ArrayList<Movie> sorted = new ArrayList(_movies);
            Collections.sort(sorted, Comparators.orderDurationDesc);
            generalDisplay(sorted);
            return sorted;
        }
        return null;
    }

    public ArrayList<Movie> getDurationAsc() {
        if (checkMoviesSize()) {
            ArrayList<Movie> sorted = new ArrayList(_movies);
            Collections.sort(sorted, Comparators.orderDurationAsc);
            generalDisplay(sorted);
            return sorted;
        }
        return null;

    }

}
