package Part2;

import java.util.Scanner;
import java.util.ArrayList;

public class Shape2DApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();

        System.out.println("How many shapes do you want?");
        int noOfShape = scan.nextInt();
        int userInput;

        for (int i = 0; i < noOfShape; i++) {
            System.out.println("Shape: " + i);
            System.out.println("1. Rectangle\n2. Square\n3. Triangle\n4. Circle");
            userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter length: ");
                    double rectangleLen = scan.nextDouble();
                    System.out.println("Enter width: ");
                    double rectangleWidth = scan.nextDouble();
                    shapeArray.add(new Rectangle(rectangleLen, rectangleWidth));
                    break;
                case 2:
                    System.out.println("Enter width: ");
                    double squareWidth = scan.nextDouble();
                    shapeArray.add(new Square(squareWidth));
                    break;
                case 3:
                    System.out.println("Enter width: ");
                    double triWidth = scan.nextDouble();
                    System.out.println("Enter height: ");
                    double triHeight = scan.nextDouble();
                    shapeArray.add(new Triangle(triWidth, triHeight));
                    break;

                case 4:
                    System.out.println("Enter radius: ");
                    double radius = scan.nextDouble();
                    shapeArray.add(new Circle(radius));
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
        double totalArea = 0;
        for (Shape shape : shapeArray) {
            totalArea += shape.calArea();
        }
        System.out.println("Total Area = " + totalArea);
        scan.close();
    }

}
