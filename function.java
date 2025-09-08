import java.util.*;

//  main keyword 1. public 2. static 

public class function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;


    }
    public static void main(String args[]) {

    }
}


// question 1 

public class Function {
    public static int calculation(int a, int b) {
        int sum = 0 + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculation(a, b);
        System.out.println("Sum of 2 number is : "+ sum);
    }
}

// find the factorial of a number.

