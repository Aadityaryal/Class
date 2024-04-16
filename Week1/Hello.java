package Week1;
/*Task 1 */
public class Hello{
    public static void main(String[] args) {
        /* 1. Write a program that prints Hello World! to the console. Save the program as Hello.java.  */
        System.out.println("Hello World!");
        /* 2. Extend/Modify the above program to print two additional lines:
        This is my first program
        I am on module ST4003CEM
        System.out.print (not println) and produces the same output. */
        System.out.print("This is my first program \n");
        System.out.print("I am on module ST4003CEM\n");
        /*3. Write a program that prints the following output:

        A "quoted" String is 
        'much' better if you learn
        the rules of "escape sequences."
        Also, "" represents an empty
        String. Don't forget: use \"
        instead of " !
        '' is not the same as " */
        System.out.print("A \"quoted\" String is \n\'much\' better if you learn \nthe rules of \"escape sequences.\" \nAlso, \"\" represents an empty \nString. Don't forget: use \\\" \ninstead of \" ! \n\'\' is not the same as \"  ");
        /*4. WAP that prints the following pattern:
        *
        **
        ***
        **** */ 
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        /*5. WAP prints the following pattern:
        *********
        *********
        *********
        ********* */
        System.out.print("********* \n********* \n********* \n*********\n");
        /*6. WAP that prints the following output:
        A well-formed Java program has a main method with { and } braces.
        A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.
        (But we type \" instead!)
        What is the difference between
        a ' and a "?  Or between a " and a \"? */
        System.out.println("A well-formed Java program has a main method with { and } braces.");
        System.out.println("A System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println("(But we type \\\" instead!)");
        System.out.println("What is the difference between");
        System.out.println("a ' and a \"?  Or between a \" and a \\\"?");

    }
    
}