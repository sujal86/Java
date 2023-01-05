class Variable { 
/* 
    File name and class name is diffrent as both are case sensitive 
    there fore we compile program with javac variable.java (file name) and 
    run with java Variable to see output (class name)

    THIS COMMENT STYLE IS USED FOR MULTILINE AS WELL CAN USE FOR SINGLE LINE TOO
    
    Here you may noticed that we havn't declare class as public because 
    public class name must be as equal as class name
*/

    public static void main(String[] args) {
        String name = "Sujal"; 
        // name is declared variable and "Sujal" is assigned value to variable
        System.out.println("Hello " + name);
    }
}

// Output

/*
    Hello Sujal
*/