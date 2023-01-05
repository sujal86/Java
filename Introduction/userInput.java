import java.util.Scanner;   // Import statement always come very first in file
// Scanner class is used to take input from user
// in this example we take integer value to understand.
public class userInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating scanner class object 
        System.out.println("Please enter your age"); // before taking any input we giving message to user
        int age = sc.nextInt(); // taking value and assigning into int object
        System.out.println("Age not stored " + sc.nextInt());    // taking input value and Printing direct 
        System.out.println("Stored into Object " + age);    // Printing input value with object
        sc.close();
    }
}

// Output

// Please enter your age
// 87   -> stored into age object
// 78   -> took input and print directly
// Age not stored 78
// Stored into Object 87