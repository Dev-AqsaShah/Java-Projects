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


