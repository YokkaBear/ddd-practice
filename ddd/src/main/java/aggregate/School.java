package aggregate;

import entity.People;
import vo.StudentCard;
import java.util.ArrayList;
import java.util.Random;

public class School {
    private String name;
    private ArrayList<People> students;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<People> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<People> getStudents() {
        return students;
    }

    public void receive(People student) {
        StudentCard studentCard = new StudentCard();
        studentCard.setId((new Random()).nextInt(100));
        studentCard.setName(student.getIdentityCard().getName());
        studentCard.setSchool(this.name);
        student.setStudentCard(studentCard);
        students.add(student);
        System.out.println("Receive student " + this.name + ": " + student.getStudentCard());
    }

    public void run() {
        System.out.println("start class + " + this.name);
        for (People student: students) {
            student.study();
        }
        for (People student: students) {
            for (int i = 0; i < 3; i++) {
                student.eat();
            }
        }
        for (People student: students) {
            student.exam();
        }
        System.out.println("finish class + " + this.name);
    }
}
