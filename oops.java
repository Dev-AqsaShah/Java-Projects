import java.util.*;
import bank;

class Pen {
    String color;
    String type; //ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}


class Student {
    String name;
    int age; 

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // normal constructor
    Student() {
        System.out.println("constructor called");
    }



// parameter constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


// copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}







public class oops {
    public static void main(String aegs[]) {
        Student s1 = new Student("aqsa", 24);
        s1.name = "aqsa";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
        s1.printInfo();



        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

    }
}


// POLYMORPHISM

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}



//  Inheritance 

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }

}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

// hybrid



class EquilateralTriangle extends Traingle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


public class oops {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color ="red";

    }
}


// pakages

public class oops {
    public static void main(String args[]) {
        bank.Account account = new bank.Account();
        account1.name = "customer";
    }
    
}


// access modifier 

