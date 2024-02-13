package com.Berta;

import java.util.ArrayList;
import java.util.List;

public class StudentDbUtil {

    public List<Student> getStudents() throws Exception {

        List<Student> students = new ArrayList<>();


        String sql = "select * from student order by last_name";

        // retrieve data from result set row
        int id = 1;
        String firstName = "Adam";
        String lastName = "Apfel";
        String email = "adam@apfel.de";
        String sex = "male";
        String geschlecht = "male";

        // create new student object
        Student tempStudent = new Student(id, firstName, lastName,
                email, sex, geschlecht);

        // add it to the list of students
        students.add(tempStudent);

        return students;
    }

    public void addStudent(Student theStudent) {

    }

    public Student getStudent(int studentId) throws Exception {

        Student theStudent = null;

        int id = 2;
        String firstName = "Berta";
        String lastName = "Birne";
        String email = "berta@birne.de";
        String sex = "female";
        String geschlecht = "female";

        theStudent = new Student(id, firstName, lastName,
                email, sex, geschlecht);

        return theStudent;
    }

    public void updateStudent(Student theStudent) throws Exception {

    }

    public void deleteStudent(int studentId) throws Exception {

    }
}

