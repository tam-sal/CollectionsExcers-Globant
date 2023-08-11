/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer01.services;

import collexcer01.entities.Race;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class RaceService {

    private final ArrayList<String> _races = new ArrayList();

    public Race createRace(String race) {
        return new Race(race);
    }

    public void addRace(String race) {
        if (_races.contains(race)) {
            System.out.println("Race already exists");
        } else {
            Race r = createRace(race);
            _races.add(r.getRace());
            System.out.println("Race created!");
        }
    }

    public ArrayList displayRaces() {
        return _races;
    }

    public int findRace(String race) {
        Iterator<String> it = _races.iterator();
        String msg = "Can't find the specified race";
        if (_races.isEmpty()) {
            msg = "Empty List";
            System.out.println(msg);
            return -1;
        }
        while (it.hasNext()) {
            String r = it.next();
            if (r.equalsIgnoreCase(race)) {
                msg = "The race " + race + " found in list";
                System.out.println(msg);
                return _races.indexOf(r);
            }
        }
        System.out.println(msg);
        return -1;
    }

    public void deleteRace(String race) {
        int idxToDel = findRace(race);
        if (idxToDel == -1) {
            System.out.println("No such race in your list!");
        } else {
            _races.remove(idxToDel);
            System.out.println("The race " + race + " has been successfully deleted!");
        }
    }

    public void displayOrdered() {
        Collections.sort(_races);
        System.out.println("*********\nOrdered Races:\n*********");
        for (String _race : _races) {
            System.out.println(_race);
        }
        System.out.println("******************");
    }

}
