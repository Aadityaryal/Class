package Week2;
/*Task 2 */
public class OperatorClass {
    public static void main(String[] args) {
        /*Arithmetic Operators */
        int a= 10, b= 10;
        int sum= a+b; //here the "+" is an arithmetic operators
        System.out.println("Addition for a+b is "+ sum);
        System.out.println("Difference for a=b is "+ (a-b));
        System.out.println("Multuplication for axb is "+ (a*b));
        System.out.println("Division for a/b is "+ (a/b));
        System.out.println("Modulo for a and b is "+ (a%2));

        /*Assignment Operators */
        int aNumber1;
        aNumber1= 10;
        /*Or Declare and assign */
        int aNumber2= 20;
        /*assign with another variable */
        int aNumber3= aNumber1;
        System.out.println("Assignment with += "+ (aNumber1+=10));
        aNumber2= 30; //same as aNumber2= aNumber2-30
        System.out.println("Assignment with -= "+ (aNumber2-=aNumber3));
        /*Relational Operators */
        int rNumber1= 10, rNumber2= 20;
        System.out.println("rNumber1 equals to rNumber2?" + (rNumber1==rNumber2));
        System.out.println("rNumber1 greater than rNumber2?"+ (rNumber1>rNumber2));
        System.out.println("rNumber1 lesser than rNumber2?"+ (rNumber1<rNumber2));
        System.out.println("rNumber not equals to rNumber2?"+ (rNumber1!=rNumber2));
        /*Logical Operators */
        int lNumber1= 10, lNumber2=12;
        boolean lExpression1= lNumber1==lNumber2;
        boolean lExpression2= lNumber1<=lNumber2;
        System.out.println(("And Operator user &&")+ (lExpression1 && lExpression2));
        System.out.println("Or Operator ||"+ (lExpression1||lExpression2));
        System.out.println("Not Operator uses !"+ (!lExpression1));

        /*Unary Operators */
        int uNumber1= 10;
        uNumber1++; //meanign uNumber1=uNumber1+1
        System.out.println("Unary for increment is ++"+ uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is --"+ uNumber1);

        /*Ternary Operator */
        int tNumber1= 10, tNumber2= 10;
        boolean tExpression= tNumber1== tNumber2;
        /*
         * One line if else, see the given example in if else
         * String output;
         * if(tExpression==true){
         *  output= "True Statement";
         * }else{
         * output="False statement";
         * }
         * 
         */
        String output= tExpression ? "True Statement" : "False Statement";
        /*Here we can assign a string out with one expression 
         * if expression is true it will return the value after the "?"
         * if the expression is false it will retun the value after the ":"
         */
        int numberOutput= tNumber1<tNumber2 ? 10:20;
        System.out.println(output);
        System.out.println(numberOutput);

        /*Task1 
         * Write a program to print whether a variable is greater or equal to 18
         */
        int vari = 20;

        if (vari >= 18) {
            System.out.println("The variable is greater than or equal to 18.");
        } else {
            System.out.println("The variable is less than 18.");
        }
        /*Task 2
         * Write a program to print simple interest from variables 
         * Make 3 variables for amount, time and rate and save the calculation into a variable
         * Formula:
         * si= amount*time*rate/100;
         */
        int amount= 2000, time= 4, rate= 13;
        int si;
        si=amount*time*rate/100;
        System.out.println("Simple interest is "+ si);
        
         /*Task 3
         * 
         * Write a program to print the area and peremeter of rectangle
         * ar=l*b
         * p=2(l+b)
         */
        int l=10, br=20;
        int ar,p;
        ar=l*br;
        p=2*(l+br);
        System.out.println("Area of rectangle is "+ ar);
        System.out.println("Perimeter of rectangle is "+ p);  
         /*Task 4
         * Complete the task 1 using ternary operators
         */
        boolean tvari= vari>=18;
        String toutput= tvari ? "The variable is greater than or equal to 18." : "The variable is less than 18.";
        System.out.println(toutput);

    }
}
