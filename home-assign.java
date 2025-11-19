// ⭐ 1. Inheritance
// Description:

// Inheritance allows one class (child) to use the properties and methods of another class (parent).

// Example:

class Car extends Vehicle { }

Program (Java):
class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {  // Inheritance
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.move(); // inherited method
    }
}

// ⭐ 2. Polymorphism
// Description:

// Polymorphism allows the same reference type to point to different objects and call their versions of methods.

// Example:

Animal a = new Dog();

Program (Java):
class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism
        a.sound(); // calls Dog's sound()
    }
}

// ⭐ 3. Method Overriding
// Description:

// When a child class provides its own version of a method already defined in the parent class.

// Example:

// @Override void sound() { ... }

Program (Java):
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() { // overriding
        System.out.println("Child show");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Child c = new Child();
        c.show(); // calls overridden method
    }
}