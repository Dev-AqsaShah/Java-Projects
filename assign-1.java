//! 1. Gravity Calculator
//! Unmodified Code

//* Unmodified Version
//* Output: "The object's position after 10.0 seconds is 0.0 m."

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0; // not calculated yet

        System.out.println("The object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.");
    }
}

//? Modified Code
//*  Modified Version
//*  Formula: x(t) = 0.5 * a * t^2 + vi * t + xi
//*  Expected Output: -490.5 m

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // acceleration (m/s^2)
        double initialVelocity = 0.0; // vi
        double fallingTime = 10.0;    // t
        double initialPosition = 0.0; // xi

        // applying formula
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime
                                + initialVelocity * fallingTime
                                + initialPosition;

        System.out.println("The object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.");
    }
}

//! 2. Simple Interest Calculator
//! Unmodified Code

//* */ Unmodified Version
//* */ Output: "The final amount after 3.0 years is 0.0."

class SimpleInterestCalculator {
    public static void main(String[] arguments) {
        double principal = 1000.0;
        double rate = 0.05;
        double time = 3.0;
        double finalAmount = 0.0; // not calculated yet

        System.out.println("The final amount after " + time + " years is " + finalAmount + ".");
    }
}

//? Modified Code
//* Modified Version
//* Formula: A = P (1 + r * t)
//* Expected Output: 1150.0

class SimpleInterestCalculator {
    public static void main(String[] arguments) {
        double principal = 1000.0; // P
        double rate = 0.05;        // r
        double time = 3.0;         // t

        // Applying formula
        double finalAmount = principal * (1 + rate * time);

        System.out.println("The final amount after " + time + " years is " + finalAmount + ".");
    }
}

//! 3. Grade Percentage Calculator
//! Unmodified Code (blank skeleton)

//*  Unmodified Version
//*  (No output because code is missing)

class GradeCalculator {
    public static void main(String[] arguments) {
        // Write the code here.
    }
}

//? Modified Code
//* */ Modified Version
//* */ Formula: Percentage = (Earned Score / Maximum Score) * 100
//* */ Expected Output:
//* */ Earned Score: 75
//* */ Maximum Score: 90
//* */ Calculated Percentage: 83.33333333333334%

class GradeCalculator {
    public static void main(String[] arguments) {
        int earnedScore = 75;
        int maxScore = 90;

        // Type casting to double for accurate division
        double percentage = ((double) earnedScore / maxScore) * 100;

        System.out.println("Earned Score: " + earnedScore);
        System.out.println("Maximum Score: " + maxScore);
        System.out.println("Calculated Percentage: " + percentage + "%");
    }
}