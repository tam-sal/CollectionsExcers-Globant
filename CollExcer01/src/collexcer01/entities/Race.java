/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer01.entities;

/**
 *
 * @author blue_
 */
public class Race {

    private String _race;

    public Race() {
    }

    public Race(String _race) {
        this._race = _race;
    }

    public String getRace() {
        return _race;
    }

    public void setRace(String _race) {
        this._race = _race;
    }

    @Override
    public String toString() {
        return "Race{" + "_race=" + _race + '}';
    }

}
