// Loops ka use tab hota hai jab humein ek hi code ko bar bar chalana ho.
// Instead of writing the same code many times, hum loop lagate hain jo condition ke true hone tak repeat hota hai.

//  Simple English:

// Loops are used to execute a block of code repeatedly as long as a given condition is true.
// They help avoid writing the same code multiple times.

//  Types of Loops in Java
//  for loop

// Roman Urdu:
// for loop tab use hota hai jab humein pehle se pata ho ke code kitni dafa repeat karna hai.

// Simple English:
// A for loop is used when you know in advance how many times you want to execute a block of code.

// Syntax:

// for(initialization; condition; update) {
//     // code to run
// }


// Example:

for(int i = 1; i <= 5; i++) {
    System.out.println("Hello Java");
}


// Output:

// Hello Java
// Hello Java
// Hello Java
// Hello Java
// Hello Java

// 2️⃣ while loop

// Roman Urdu:
// while loop tab chalta hai jab tak condition true hoti rahe. Jab condition false hoti hai to loop ruk jata hai.

// Simple English:
// A while loop runs as long as the condition is true. When the condition becomes false, the loop stops.

// Syntax:

// while(condition) {
//     // code to run
// }


// Example:

int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}


// Output:

// 1
// 2
// 3
// 4
// 5

// 3️⃣ do-while loop

// Roman Urdu:
// do-while loop kam az kam ek dafa zaroor chalta hai, chahe condition false hi kyu na ho.
// Pehle code chalta hai, phir condition check hoti hai.

// Simple English:
// A do-while loop executes the code block at least once, even if the condition is false. The condition is checked after the loop runs.

// Syntax:

// do {
//     // code to run
// } while(condition);


// Example:

int i = 1;
do {
    System.out.println(i);
    i++;
} while(i <= 5);


// Output:

// 1
// 2
// 3
// 4
// 5