// if-else statement program mein decision lene ke liye use hoti hai. Ye check karti 
// hai ke koi condition true hai ya false. Agar condition true ho to if ka block chalta hai, warna else ka block execute hota hai.

// Simple English:
// The if-else statement is used to make decisions in a program. It checks whether a
//  condition is true or false. If the condition is true, the code inside the if block runs; otherwise, the code inside the else block runs.

// Syntax / Structure:

if (condition) {
    // code runs if condition is true
} else {
    // code runs if condition is false
}


Example:

int age = 18;

if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}


// Output:

// You are eligible to vote.








// switch

// switch statement ka use tab hota hai jab humein aik variable ki value ke basis par multiple options (cases) mein se koi aik choose karna ho. Ye if-else ki tarah hi kaam karta hai, lekin jab bohat saari conditions hoti hain to code zyada clean aur readable banata hai.

// Simple English:
// The switch statement is used when you need to choose one option from many based on the value of a variable. It works like an if-else chain but makes the code cleaner and easier to read when there are multiple conditions.

//  Syntax / Structure:

switch (variable) {
    case value1:
        // code to execute if variable == value1
        break;

    case value2:
        // code to execute if variable == value2
        break;

    default:
        // code to execute if no case matches
}

// 💡 Example:
// int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
}


// Output:

// Wednesday


// Note (Roman Urdu):
// Har case ke baad break likhna zaroori hota hai taake code agle case tak na chale. Agar break hata dein to next case bhi execute ho jata hai (isko fall-through kehte hain).