package com.company;

public class Example2 {
    public static void main(String[] args) {
        // declared variable as start with alphabets and like xyz ,xyz1  xy_z  is correct but 1xyz is Not correct
        Cat
                c =
                new Cat(); // as we declared object of any class everytime default cons run
        c.age =
                15;
        c.name =
                "lili";
        System.out.println("this is my bage" + c.age);
        c.saymeow();
        var
                va =
                new Cat();
        va.name =
                "kishan";
        va.saymeow();
    }
}
