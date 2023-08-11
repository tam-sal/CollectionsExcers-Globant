/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collext02.services;

import collext02.entities.Singer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author blue_
 */
public class SingerService {

    private final ArrayList<Singer> _singers = new ArrayList();

    public Singer createSinger(String name, String album) {
        return new Singer(name, album);
    }

    public void addSinger(String name, String album) {
        Singer s = createSinger(name, album);
        _singers.add(s);
    }

    public boolean isSingersFilled() {
        return !_singers.isEmpty();
    }

    public void displaySingers() {
        if (isSingersFilled()) {
            _singers.forEach(s -> System.out.println(
                    s.getName() + "**" + s.getAlbum())
            );
        } else {
            System.out.println("Empty Singers List");
        }
    }

    public void deleteSinger(String name) {
        boolean removed = false;
        if (isSingersFilled()) {
            Iterator<Singer> itSinger = _singers.iterator();
            while (itSinger.hasNext()) {
                Singer s = itSinger.next();
                if (s.getName().equalsIgnoreCase(name)) {
                    _singers.remove(s);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                System.out.println("Singer " + name + " has been successfully removed");
            } else {
                System.out.println("Singer " + name + " not in list");
            }

        } else {
            System.out.println("Empty List");
        }
    }

}
