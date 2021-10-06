package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hobby;

    public String getSummary(){
        return getFullName() + " is " + age + " years old and likes " + hobby;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
