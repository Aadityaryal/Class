package Week3;
//Task 1
public class IfElseStatement {
    public static void main(String[] args) {
        /*Simple  if example*/
        if(true){
            System.out.println("True Statement");
        }
        /*If takes an expression with boolean value */
        int num1=10, num2=20;
        if (num1>num2){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }
        /*If else if, two condition */
        if(num1==num2){
            System.out.println("Equals");
        }else if(num1<num2){
            System.out.println("Lesser num2");
        }else{
            System.out.println("Greater");
        }
        /*Note that else should be at last and is not mandatory */
        /*If else if ladder multiple condition */
        if(num1<0){
            System.out.println("Num1 is negative. ");
        }else if(num2<0){
            System.out.println("Num2 is negative. ");
        }else if(num1!=num2){
            System.out.println("Greater");
        }else{
            System.out.println("Default Statement. ");
        }
        /*If any condition matches it will skip all the remaining 
         * conditions including else, condition will be checked from 
         * top-bottom
        */
        /*Nested if condition */
        if(num1>0){
            if(num1>num2){
                System.out.println("Positi ve and greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }else{
            if(num1>num2){
                System.out.println("Negative and greater");
            }else{
                System.out.println("Negative and lesser");
            }
        }
    }
}
