package Tasks;

import java.util.Scanner;

public class Week3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*1. Write a JAVA program to find the maximum between three numbers. */
        int a=5,b=7,c=9;
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The maximum value is "+ max);
        /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        int n=5;
        if(n>0){
            System.out.println("Given number is positive. ");
        }else if(n<0){
            System.out.println("Given number is negative. ");
        }else{
            System.out.println("Given number is zero. ");
        }
        /*3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        int div=35;
        if(div%5==0){
            if(div%11==0){
                System.out.println("Given number is divisible by 5 and 11");
            }
        }else{
            System.out.println("Given number is not divisible by 5 and 11. ");
        }
        /*4. Write a JAVA program to check whether a number is even or odd. */
        int eo=13;
        if(eo%2==0){
            System.out.println("Given number is even. ");
        }else{
            System.out.println("Given number is odd. ");
        }
        /*5. Write a JAVA program to check whether a year is a leap year or not. 
        Hint: if year%4==0; if year%100!==0 ; year%400==0; */
        int year=2063;
        if(year%4==0){
            if(year%100!=0){
                if(year%400==0){
                    System.out.println("Given year is a leap year. ");
                }
            }
        }else{
            System.out.println("Given year is not a leap year. ");
        }

        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }
        //Switch case questions
        /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it 
        to the corresponding GPA value. Use a switch case statement to handle different grades. */
        /*scanner = new Scanner(System.in);*/
        //error occured when closing previous scanner and using another scanner, so all this in same scanner
        
        System.out.print("Enter student's grade (A, B, C, D, or F): ");
        char grade = scanner.next().toUpperCase().charAt(0);
        double gpa;
        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return;
        }
        System.out.println("The GPA equivalent of grade " + grade + " is: " + gpa);

        /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
        and performs the corresponding arithmetic operation using a switch case statement. */
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);

        /*3. Write a Java program that takes an integer input (1 to 12) 
        representing a month and prints the corresponding season 
        (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        System.out.print("Enter a month (1 to 12): ");
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                System.out.println("Invalid month entered.");
                return;
        }
        System.out.println("The season for month " + month + " is: " + season);

        /*4. Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        double area;
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * Math.pow(radius, 2);
                System.out.println("Area of the circle: " + area);
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 4: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice.");
            scanner.close();
        }
    }   
}
