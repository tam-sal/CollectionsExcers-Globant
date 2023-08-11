/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collexcer02.services;

import collexcer02.entities.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class StudentService {

    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");
    private final ArrayList<Student> _students = new ArrayList();

    public Student createStudent() {
        Student s = new Student();
        ArrayList<Integer> score = new ArrayList();
        System.out.println("Enter Student's name: ");
        s.setName(_input.next());
        System.out.println("Enter Student's 3 scores: ");
        int scoreQty = 3;
        int singleScore;
        while (scoreQty > 0) {
            singleScore = _input.nextInt();
            if (singleScore < 3 || singleScore > 11) {
                System.out.println("Marks should be between 3 and 10");

            } else {
                score.add(singleScore);
                scoreQty--;
            }
        }
        s.setScore(score);
        _students.add(s);
        return s;
    }

    public void addStudents() {
        String res = "";
        while (!res.equalsIgnoreCase("x")) {
            System.out.println("Press [Y] to create a new student | [x] to Exit");
            res = _input.next();
            if (res.equalsIgnoreCase("y")) {
                createStudent();
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return _students;
    }

    public double finalScore() {
        double out = -1;
        double sum = 0;
        ArrayList<Integer> scores = new ArrayList();
        System.out.println("Enter student's name to get the final score");
        String nameInput = _input.next();
        if (!_students.isEmpty()) {
            for (Student s : _students) {
                if (s.getName().equalsIgnoreCase(nameInput)) {
                    scores = s.getScore();
                }
            }
            if (scores.isEmpty()) {
                System.out.println("Student not found");
                return out;
            }
        } else {
            System.out.println("Empty List");
            return out;
        }
        for (Integer sc : scores) {
            sum += sc;
        }
        out = sum / 3;
        System.out.println("Final Score is: " + out);

        return out;
    }

}
