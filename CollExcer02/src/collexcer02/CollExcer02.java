/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer02;

import collexcer02.services.StudentService;

/**
 *
 * @author blue_
 */
public class CollExcer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StudentService ss = new StudentService();
        ss.finalScore();
        ss.addStudents();
        System.out.println(ss.getStudents().toString());
        ss.finalScore();
        
    }
    
}
