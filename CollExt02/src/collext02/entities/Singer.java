/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext02.entities;

/**
 *
 * @author blue_
 */
public class Singer {
    private String _name;
    private String _album;

    public Singer() {
    }

    public Singer(String _name, String _album) {
        this._name = _name;
        this._album = _album;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setAlbum(String _album) {
        this._album = _album;
    }

    public String getName() {
        return _name;
    }

    public String getAlbum() {
        return _album;
    }

    @Override
    public String toString() {
        return "Singer{" + "_name=" + _name + ", _album=" + _album + '}';
    }
    
    
    
}
