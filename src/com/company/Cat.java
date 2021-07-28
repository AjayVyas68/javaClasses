package com.company;

public class Cat {
    String
            name;
    int
            age;

    Cat() // cons does not return type
    {
        System.out.println("cat is created");
    }

    void saymeow() {
        System.out.println("meow!" + this.name);
    }

}
