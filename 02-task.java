//!  1) Logic (short)

// Normal ticket price = 500 Rs.

// Inputs: age (int), tickets (int), day (1 = weekday, 2 = weekend).

// If day == 1 (weekday):

// age < 10 → 50% discount (0.5)

// age >= 60 → 30% discount (0.3)

// otherwise → no discount (0)

// If day == 2 (weekend): no discounts.

// Final = (price per ticket after discount) * tickets.




//! 2) Pseudocode

// Read age, tickets, day.

// Validate inputs.

// Decide discount based on age and day.

// pricePerTicket = 500 * (1 - discount).

// total = pricePerTicket * tickets.

// Print total.



import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {
        final double NORMAL_PRICE = 500.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Enter day type (1 = weekday, 2 = weekend): ");
        int day = sc.nextInt();

        // basic validation
        if (age < 0 || tickets <= 0) {
            System.out.println("Invalid input: age must be >= 0 and tickets must be > 0.");
            sc.close();
            return;
        }
        if (day != 1 && day != 2) {
            System.out.println("Invalid day type. Enter 1 for weekday or 2 for weekend.");
            sc.close();
            return;
        }

        double discount = 0.0;

        if (day == 1) { // weekday: possible discounts
            if (age < 10) {
                discount = 0.50; // 50%
            } else if (age >= 60) {
                discount = 0.30; // 30%
            }
        } // if day == 2 -> discount remains 0

        double pricePerTicket = NORMAL_PRICE * (1 - discount);
        double totalBill = pricePerTicket * tickets;

        // print with one decimal like in examples
        System.out.printf("Your total bill is: %.1f Rs.%n", totalBill);

        sc.close();
    }
}




//! task-2 

import java.time.LocalDate;
import java.util.Scanner;

public class AirlineTicketBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Base ticket price
        final double BASE_PRICE = 500.0;

        // Input: Birth year and number of tickets
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        // Find current year using LocalDate
        int currentYear = LocalDate.now().getYear();

        // Calculate age
        int age = currentYear - birthYear;

        // Determine discount
        double discountRate;
        if (age < 18) {
            discountRate = 0.20;  // 20% discount
        } else if (age <= 59) {
            discountRate = 0.05;  // 5% discount
        } else {
            discountRate = 0.20;  // 20% discount
        }

        // Calculate discounted price per ticket
        double discountedPrice = BASE_PRICE - (BASE_PRICE * discountRate);

        // Calculate total bill
        double totalBill = discountedPrice * tickets;

        // Output
        System.out.println("Your total bill is: $" + totalBill);
        
        sc.close();
    }
}
