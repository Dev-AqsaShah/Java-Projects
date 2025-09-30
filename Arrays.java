import java.util.*;
// defining an array 2
// type[] arrayName = {1,2,3,4,5,6};


public class array {
    public static void main(String args[]) {
        int marks[] = {97, 98, 95};
           System.out.println(marks[i]);
    }
}


public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            System.out.println(numbers[i])
        }
    }
}


// Points About Arrays in Java

// Definition → An array is a collection of multiple values of the same data type stored in a single variable.

// Fixed Size → Arrays in Java have a fixed length (once created, the size cannot be changed).

// Indexing → Array elements are stored in continuous memory locations and can be accessed using index numbers starting from 0.
// Example: arr[0] is the first element.

// Declaration → Arrays must be declared before use.
// Example:

// int[] numbers = new int[5];  // array of size 5


// Initialization → You can give values at the time of creation.
// Example:

// int[] nums = {10, 20, 30, 40, 50};


// Accessing Elements → You can get or change values using index.
// Example:

// System.out.println(nums[2]);  // prints 30
// nums[1] = 25;  // changes 20 to 25


// Length Property → array.length gives the total number of elements in the array.

// Loop with Arrays → Arrays are often used with loops to access each element.
// Example (for loop):

// for(int i=0; i<nums.length; i++) {
//     System.out.println(nums[i]);
// }


// Types of Arrays →

// Single-dimensional (1D): Simple list of values.

// Multi-dimensional (2D or more): Like tables/matrices.
// Example:

// int[][] matrix = { {1, 2}, {3, 4} };


// Use Cases → Arrays are useful for storing lists of numbers, names, marks, etc. in one variable.