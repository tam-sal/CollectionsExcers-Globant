/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer02.entities;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author blue_
 */
public class Student {
    private String _name;
    private ArrayList<Integer> _score;

    public Student() {
    }

    public Student(String _name, ArrayList<Integer> _score) {
        this._name = _name;
        this._score = _score;
    }

    public String getName() {
        return _name;
    }

    public ArrayList<Integer> getScore() {
        return _score;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setScore(ArrayList<Integer> _score) {
        this._score = _score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this._name);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this._name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "_name=" + _name + ", _score=" + _score + '}';
    }
    
    
    
}
