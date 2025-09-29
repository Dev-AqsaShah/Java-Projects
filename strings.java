// non primitive data types
// 
import java.util.*;
import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        // String declaration
        // String name = "aqsa";
        // String fulname = "aqsa shah";
        // String sentence = "im aqsa shah here. ";

        // Scanner sc = new Scanner(System.in);
        //     String name = sc.next();
        //     System.out.println("your name is : "+ name);

        // functions use string
        // 1. concatination
        String firstName = "aqsa";
        String lastName = "shah";
        String fulName = firstName + "" + lastName;
        System.out.println(fulName);
        // length maloom krne k lie 
        System.out.println(fulName.length());


        // charAt
        for(int i=0; i<fulName.length(); i++) {
            System.out.println(fulName.charAt(i));
        }

        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are equal");
        }
    }
}
// strings are immutable in java

// string builder


// Points About Strings in Java

// Definition → In Java, a string is a sequence of characters. Example:

// String name = "Aqsa";


// Class → In Java, String is a class, not a primitive data type.

// Quotes → Strings are always written inside double quotes (" ").

// Immutable → Strings in Java are immutable (once created, they cannot be changed).
// Example:

// String s1 = "Hello";
// s1 = s1 + " World"; // Creates new string "Hello World"


// String Methods → The String class has many useful methods:

// length() → finds the number of characters.

// toUpperCase() → converts to capital letters.

// toLowerCase() → converts to small letters.

// charAt(index) → returns character at given position.

// concat() → joins two strings.

// Indexing → Each character has an index starting from 0.
// Example:
// "Java" → J=0, a=1, v=2, a=3

// String Objects → Strings can be created in two ways:

// Using string literal:

// String s1 = "Hello";


// Using new keyword:

// String s2 = new String("Hello");


// Use Cases → Strings are widely used to handle text data like names, messages, input/output, etc.