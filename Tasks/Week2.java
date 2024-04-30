package Tasks;
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        /*1. Write a program to check whether a person can cast 
        a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to cast your vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote. You must be over 18 years old.");
        }
        /*2. Write a program to calculate SI. Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principalAmount * time * rate) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        System.out.println("Calculate Area of Triangle");
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaOfTriangle);

        System.out.println("\nCalculate Volume of Cube");
        System.out.print("Enter the side length of the cube: ");
        double sideLengthCube = scanner.nextDouble();

        double volumeOfCube = Math.pow(sideLengthCube, 3);
        System.out.println("Volume of the cube: " + volumeOfCube);

        System.out.println("\nCalculate Volume of Cuboid");
        System.out.print("Enter the length of the cuboid: ");
        double lengthCuboid = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double widthCuboid = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double heightCuboid = scanner.nextDouble();

        double volumeOfCuboid = lengthCuboid * widthCuboid * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);

        /*4. Write the ternary operator for question no. 1 */
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        String eligibility = (age >= 18) ? "eligible to cast your vote" : "not eligible to vote";

        System.out.println("You are " + eligibility + ".");
        /*5. Write a program to take two integer inputs from the user and print the sum and product of them. */
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        Finally, calculate the division of the thus obtained sum and product and print the result. */
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        double divisionResult = (double) sum / product;
        System.out.println("Division of the sum by the product: " + divisionResult);

        /*7. Take the name, roll number, and field of interest from the user and print in the format 
        below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
        System.out.println("My field of interest is " + fieldOfInterest + ".");

        /*8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, 
        Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        System.out.print("Enter the side length of the square: ");
        double sideLengthSquare = scanner.nextDouble();

        double areaOfSquare = sideLengthSquare * sideLengthSquare;
        double perimeterOfSquare = 4 * sideLengthSquare;

        System.out.println("\nArea of the square: " + areaOfSquare);
        System.out.println("Perimeter of the square: " + perimeterOfSquare);

        System.out.print("\nEnter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        rate = scanner.nextDouble();

        // Calculating simple interest
        simpleInterest = (principalAmount * time * rate) / 100;

        // Printing simple interest
        System.out.println("\nSimple Interest: " + simpleInterest);

        // Taking input for the base and height of the triangle
        System.out.print("\nEnter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();

        // Calculating area of the triangle
        areaOfTriangle = 0.5 * base * height;

        // Printing area of the triangle
        System.out.println("Area of the triangle: " + areaOfTriangle);

        // Taking input for the side length of the cube
        System.out.print("\nEnter the side length of the cube: ");
        sideLengthCube = scanner.nextDouble();

        // Calculating volume of the cube
        volumeOfCube = Math.pow(sideLengthCube, 3);

        // Printing volume of the cube
        System.out.println("Volume of the cube: " + volumeOfCube);

        // Taking input for the length, width, and height of the cuboid
        System.out.print("\nEnter the length of the cuboid: ");
        lengthCuboid = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        widthCuboid = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        heightCuboid = scanner.nextDouble();

        // Calculating volume of the cuboid
        volumeOfCuboid = lengthCuboid * widthCuboid * heightCuboid;

        // Printing volume of the cuboid
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);

        /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Taking input for the breadth of the rectangle
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculating area of the rectangle
        double area = length * breadth;

        // Type-casting the area to int
        int areaInt = (int) area;

        // Printing area of the rectangle as int
        System.out.println("Area of the rectangle (type-casted to int): " + areaInt);

        /*10. Write a program to calculate the total marks of four subjects of a student and 
        the total percentage secured. And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */
        System.out.print("Enter marks of subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int subject3Marks = scanner.nextInt();

        System.out.print("Enter marks of subject 4: ");
        int subject4Marks = scanner.nextInt();

        // Calculating total marks
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;

        // Calculating total percentage
        double totalPercentage = (totalMarks * 100.0) / 400.0;

        // Generating final result based on conditions
        String result = (totalPercentage >= 70) ? "First Class" :
                        (totalPercentage > 59) ? "Upper Second Class" :
                        (totalPercentage > 49) ? "Second Class" :
                        (totalPercentage > 39) ? "Third Class" : "Fail";

        // Printing total marks, total percentage, and final result
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Total Percentage: " + totalPercentage + "%");
        System.out.println("Result: " + result);
        scanner.close();






    }
}
