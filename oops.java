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


