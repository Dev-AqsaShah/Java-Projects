// ⭐ What is a Constructor?

// A constructor is a special method inside a class that runs automatically when you create an object.
// It is used to set initial values of the object.

// ✔️ Important points:

// Constructor ka name class ke name jaisa hota hai

// Constructor no return type rakhta hai (not even void)

// It runs only once per object

// Used for initialization

// ⭐ Why do we use Constructor?

// To give objects starting values
// (jese object banne ke sath hi name, age, id set ho jaye)

// ⭐ Types of Constructors in Java

// Default Constructor

// Parameterized Constructor

// Copy Constructor (Java doesn’t have true copy constructor, but we create manually)

// ✅ 1. Default Constructor

// Jab tum class me constructor nahi likhti, Java khud ek empty default constructor bana deta.

// Example:

class Student {
    // default constructor (Java creates it automatically)
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructor runs here
        System.out.println("Object created!");
    }
}

// ✅ 2. Parameterized Constructor

// Isme hum values pass karte hain.

// Example:

class Student {
    String name;
    int age;

    // parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aqsa", 20);
        System.out.println(s1.name + " - " + s1.age);
    }
}

// ⭐ Output
// Aqsa - 20

// ✅ 3. Custom Copy Constructor

// Hum manually copy bana sakte hain.

Example:
class Student {
    String name;
    int age;

    // normal constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // copy constructor
    Student(Student obj) {
        name = obj.name;
        age = obj.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aqsa", 20);
        Student s2 = new Student(s1); // copying

        System.out.println(s2.name + " - " + s2.age);
    }
}

// ⭐ Summary (super easy):

// Constructor → auto-runs, no return type, same name as class

// Used to initialize object

// Types → Default, Parameterized, Copy