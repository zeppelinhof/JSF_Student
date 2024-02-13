package com.Berta;

import jakarta.annotation.ManagedBean;

@ManagedBean
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String sex;
    private String geschlecht;


    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, String sex, String geschlecht) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.geschlecht = geschlecht;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", sex=" + sex + "]";
    }

}

