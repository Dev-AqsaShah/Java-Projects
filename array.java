// syntax
// type[]arrayName = new type[size];



// defs

// Array aik aisi data structure hoti hai jisme hum same type ke multiple values
//  (jaise numbers, strings, etc.) ek hi variable mein store karte hain. Har value ko uske index ke zariye access kiya jata hai.

// Simple English:
// An array is a data structure that stores multiple values of the same type 
// in a single variable. Each value can be accessed using its index number.




public class array {
    public static void main{String args[]} {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
}