/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext03.entities;

import java.util.Objects;

/**
 *
 * @author blue_
 */
public class Book {

    private String _title;
    private String _author;
    private int _copies;
    private int _borrowedCopies;

    public Book() {
    }

    public Book(String _title, String _author, int _copies, int _borrowedCopies) {
        this._title = _title;
        this._author = _author;
        if (_copies < 1) {
            throw new Error("Copies count can't be less than 1");
        }
        this._copies = _copies;
        if (_borrowedCopies > _copies) {
            throw new Error("Borrowed quantity cannot be major than existing copies");
        }
        this._borrowedCopies = _borrowedCopies;
    }

    public String getTitle() {
        return _title;
    }

    public String getAuthor() {
        return _author;
    }

    public int getCopies() {
        return _copies;
    }

    public int getBorrowedCopies() {
        return _borrowedCopies;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public void setAuthor(String _author) {
        this._author = _author;
    }

    public void setCopies(int _copies) {
        if (_copies < 1) {
            throw new Error("Copies can't be less than one");
        }
        this._copies = _copies;
    }

    public void setBorrowedCopies(int _borrowedCopies) {
        if (this._copies < _borrowedCopies) {
           throw new Error("Borrowed copies can't exceed the existing copies");
        }
        this._borrowedCopies = _borrowedCopies;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Book other = (Book) obj;
        if (!Objects.equals(this._title, other._title)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Book{" + "_title=" + _title + ", _author=" + _author + ", _copies=" + _copies + ", _borrowedCopies=" + _borrowedCopies + '}';
    }

}
