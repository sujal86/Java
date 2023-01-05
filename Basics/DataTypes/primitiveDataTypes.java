// We will what kind of datatypes are available and what there useage
/*
 * In Java it has 2 type of data types
 * Primitive and
 * Non Primitive
 * 
 * Primitive data types has following data types
 * byte, short, int, long, float, double, char, boolean
 * 
 * Non Primitive data types has following data types
 * Majorly => String, Array
 * 
 * In this program we will see PRIMITIVE DATA TYPES
 * Non Primitive data type we will see later
 * 
 */
import java.util.Scanner;
public class primitiveDataTypes {
    public static void main(String[] args) {
        
        /* 
            First we see How to declare variable in various data types
            We will see there output
            Than we take user input and print it 
        */ 

        // First we see INTEGER type of data types

        byte byteValue = -127;      // Variable should declare as naming convincing and 
        // byte errorByteValue = 130; // This Line will throw an error 
        /* 
            byte data type can smallest range of values storage capacity in java
            its between -127 to 128, default value is 0
        */ 
        System.out.println("Byte Datatype Value is " + byteValue);

        short shortValue = 32767;
        // short errorShortValue = -35000; // This Line will throw an error 
        /*
         * short data type can bigger range of values storage capacity in java
         * its between -32,768 and 32,767, default value is 0
         */
        System.out.println("Short Datatype Value is " + shortValue);

        int intValue = 2147483647;
        // int errorIntValue = -2147483649; // This Line will throw an error 
        /*
         * int data type can store huge integer values range in java
         * -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive), default value is 0
         */
        System.out.println("Int Datatype Value is " + intValue);

        long longValue = 9223372036854775807L;
        // long errorLongValue = -9223372036854775809L; // This Line will throw an error 
        /*
         * long datatype can store highest range of integer type values, 
         * the value should contain 'L'at the end to define the variable and value is long type
         * -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive), default value is 0
         */
        System.out.println("Long Datatype Value is " + longValue);


    }
    
}