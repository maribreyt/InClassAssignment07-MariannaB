package com.example.android.inclassassignment07_mariannab;

import java.io.Serializable;

/**
 * Created by maribreyt on 3/7/18.
 */

public class Person implements Serializable {
    String name;
    int age;
    boolean glasses;

    public Person(String name, int age, boolean glasses) {
        this.name = name;
        this.age = age;
        this.glasses = glasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGlasses() {
        return glasses;
    }

    public void setGlasses() {
        this.glasses = glasses;
    }

    @Override
    public String toString() {
        return "Name is: " + name + "\nAge is: " + age +
                "\nWearing glasses: " + glasses + "\n";
    }

}
