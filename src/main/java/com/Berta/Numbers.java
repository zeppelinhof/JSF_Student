package com.Berta;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@RequestScoped
public class Numbers {
    private Integer age = 2;
    private String firstName = "Hase";

    public void Numbers(){}

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void incrementAge() {
        age++;
    }

}
