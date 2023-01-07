// In this We learn how to take input from user on runtime 
import java.util.Scanner;   // Scanner class will help us to solve our this problem
public class userInput {
    public static void main(String[] args) {
        // we learn already what is primitive data types.
        // now we will learn how to take user input for every perticuler data types

        Scanner sc = new Scanner(System.in);    
        // sc is scanner class object which help us to allow and read value from input

        // First we print on console what user have to give input
        // Than we take input from user 
        // Then we print what input was enterd

        // Byte data input
        System.out.println("Please Give Byte type input");  // Given user a messege what to do
        Byte byteValue = sc.nextByte(); // User given input
        System.out.println( "Byte Number is "+ byteValue); // we print what input was that

        // Short data input
        System.out.println("Please Give Short type input");  
        Short shortValue = sc.nextShort();
        System.out.println( "Short Number is "+ shortValue);

        // Integer data input
        System.out.println("Please Give Integer type input");  
        int intValue = sc.nextInt();
        System.out.println( "Integer Number is "+ intValue);

        // Long data input
        System.out.println("Please Give Long type input");
        long longValue = sc.nextLong();
        System.out.println( "Long Number is "+ longValue);

        // Float data input
        System.out.println("Please Give Float type input");  
        Float floatValue = sc.nextFloat();
        System.out.println( "Float Number is "+ floatValue);

        // Double data input
        System.out.println("Please Give Double type input");
        Double doubleValue = sc.nextDouble();
        System.out.println( "Double Number is "+ doubleValue);

        // Boolean data input
        System.out.println("Please Give Boolean type input (true / false)");
        Boolean booleanValue = sc.nextBoolean();
        System.out.println( "Boolean Value is "+ booleanValue);

        // Char data input
        System.out.println("Please Give char type input");
        char charValue = sc.next().charAt(0);
        System.out.println( "Char Value is "+ charValue);

        // String data input
        System.out.println("Please Give String type input");  
        String stringValue = sc.nextLine();
        System.out.println( "String Value is "+ stringValue);
        
        sc.close(); // closing current scanner object.

    }
}
