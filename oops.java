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


// ppublic class oops {
    public static void main(String args[]) {
        bank.Account account = new bank.Account();
        account1.name = "customer";
    }
    
}


// access modifier 


// Encapsulation

// data hide


// abstraction
// important chize user ko dikhana or baki hide krdena

abstract class Animal {
    public void walk() {

    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class oops {
    public static void main(String args[]) {
    horse.walk(); 
    }
    
}


// interfaces abstraction 

interface Animal {
    public void walk();
}

class Horse implements Animal {

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class oops {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}

// so here are the basic of opp

// oops points  

// Main Concepts of OOP in Java
// 1. Class

// Class ek blueprint ya template hoti hai jisme properties (variables) aur behaviors (methods) define hote hain.

// Example:

// class Student {
//     String name;
//     int age;
    
//     void study() {
//         System.out.println(name + " is studying.");
//     }
// }

// 2. Object

// Object ek instance of a class hota hai — yani ek real entity jo class ke data ko use karti hai.

// Example:

// Student s1 = new Student();
// s1.name = "Aqsa";
// s1.age = 20;
// s1.study();

// 3. Encapsulation

// Data aur methods ko ek unit (class) me band karna.

// Data ko private banakar aur getters/setters ke through access dena — isi ko encapsulation kehte hain.

// Example:

// class Account {
//     private double balance;

//     public void setBalance(double amount) {
//         balance = amount;
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// 4. Inheritance

// Ek class doosri class ke properties aur methods ko inherit (yaani use) karti hai.

// “extends” keyword se hota hai.

// Reusability badhata hai.

// class Animal {
//     void eat() { System.out.println("Eating..."); }
// }

// class Dog extends Animal {
//     void bark() { System.out.println("Barking..."); }
// }

// 5. Polymorphism

// Matlab "many forms" — ek hi method name ka alag-alag behavior.

// 2 Types:

// Compile-time (Method Overloading)

// Runtime (Method Overriding)

// // Overloading
// class MathOps {
//     int add(int a, int b) { return a + b; }
//     double add(double a, double b) { return a + b; }
// }

// // Overriding
// class Animal {
//     void sound() { System.out.println("Some sound"); }
// }
// class Cat extends Animal {
//     void sound() { System.out.println("Meow"); }
// }

// 6. Abstraction

// Sirf essential details dikhana aur unnecessary details hide karna.

// Abstract class ya interface ke zariye achieve hota hai.

// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     void draw() { System.out.println("Drawing circle"); }
// }

// 💡 Extra Important Points

// Java OOP ka main aim: modularity, reusability, security, and maintainability.

// Constructor: special method used to initialize objects.

// Access Modifiers: public, private, protected, default.

// ‘this’ keyword: refers to current object.

// ‘super’ keyword: parent class ke members ko access karne ke liye.