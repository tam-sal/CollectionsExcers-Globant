/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer03.entities;

import java.util.Objects;

/**
 *
 * @author blue_
 */
public class Movie {
    private String _title;
    private String _director;
    private Integer _duration;

    public Movie() {
    }

    public Movie(String _title, String _director, Integer _duration) {
        this._title = _title.toLowerCase();
        this._director = _director.toLowerCase();
        this._duration = _duration;
    }

    public void setTitle(String _title) {
        this._title = _title.toLowerCase();
    }

    public void setDirector(String _director) {
        this._director = _director.toLowerCase();
    }

    public void setDuration(Integer _duration) {
        this._duration = _duration;
    }

    public String getTitle() {
        return _title;
    }

    public String getDirector() {
        return _director;
    }

    public Integer getDuration() {
        return _duration;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this._title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this._title, other._title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie{" + "_title=" + _title + ", _director=" + _director + ", _duration=" + _duration + '}';
    }
    
    
    
}
