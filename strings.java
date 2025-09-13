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


