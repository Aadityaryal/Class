package Week2;
//Task 3
import java.util.Scanner;
/*Or
 * import java.util.*;
*/
public class inputOutput {
    public static void main(String[] args) {
        System.out.println("This sentence will have line break.");
        /*System.out.print */
        System.out.print("This will not have break. ");
        System.out.print("This line will continue. \n");
        /*String formatting using System.out.printf
         * %s String, %d Integral, %f Floating point, %b Boolean
         * This will also not break line. 
        */
        System.out.printf("Hello %s, good morning", 10);
        System.out.printf("The number is %d", 10);
        /*Can use multiple formatter  */
        System.out.printf("\nThe floating %f and boolean %b", 10.3f,false);
        /*User Input
         * import.java.util.Scanner; //copy this line at the top of the code.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("The following take whole sentence");
        String wholeOutput= scan.nextLine();
        System.out.println("The input taken is "+ wholeOutput);
        System.out.println("The following takes integer. ");
        int intInput= scan.nextInt();
        System.out.println("The input taken is "+ intInput);
        System.out.println("The following take double");
        double doubleInput= scan.nextDouble();
        System.out.println("The input taken is "+ doubleInput);
        System.out.println("The following takes boolean. ");
        Boolean booleanInput= scan.nextBoolean();
        System.out.println("The input taken is "+ booleanInput); 
        scan.close();//You must close the scanner once all the inout is taken. 
        /*Task
         * Make a new scanner object scan1
         * Prompt the following and take input
         * What is your name? save the input to string -> name
         * Are you over 18? save the input to boolean -> status
         * How many sibling? Save the input to integer -> sibling 
         * Print the following 
         * Hello name, 
         * Over 18?, status
         * You have sibling number of sibling 
        */
        System.out.println("Hello");
        //Task
        Scanner scan1= new Scanner(System.in);
        System.out.println("What is your name? ");
        String name= scan1.nextLine();
        System.out.println("Are you over 18?");
        Boolean status= scan1.nextBoolean();
        System.out.println("How many sibling?");
        Integer sibling= scan1.nextInt();
        System.out.println("Hello "+ name+ ",");
        System.out.println("Over 18? "+ status);
        System.out.println("You have "+ sibling + " number of sibling. ");
        scan1.close();

    }
}
