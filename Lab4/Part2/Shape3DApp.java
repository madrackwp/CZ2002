package Part2;

import java.util.Scanner;
import java.util.ArrayList;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();

        System.out.println("How many shapes do you want?");
        int noOfShape = scan.nextInt();
        int userInput;

        for (int i = 0; i < noOfShape; i++) {
            System.out.println("Shape: " + i);
            System.out.println("1. Cuboid\n2. Pyramid\n3. Sphere");
            userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter length: ");
                    double rectangleLen = scan.nextDouble();
                    System.out.println("Enter width: ");
                    double rectangleWidth = scan.nextDouble();
                    System.out.println("Enter height: ");
                    double rectangleHeight = scan.nextDouble();
                    shapeArray.add(new Cuboid(rectangleLen, rectangleWidth, rectangleHeight));
                    break;
                case 2:
                    System.out.println("Enter width: ");
                    double pyWidth = scan.nextDouble();
                    System.out.println("Enter height: ");
                    double pyHeight = scan.nextDouble();
                    shapeArray.add(new Pyramid(pyWidth, pyHeight));
                    break;

                case 3:
                    System.out.println("Enter radius: ");
                    double radius = scan.nextDouble();
                    shapeArray.add(new Sphere(radius));
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
        double totalArea = 0;
        for (Shape shape : shapeArray) {
            System.out.println(shape.calArea());
            totalArea += shape.calArea();
        }
        System.out.println("Total Area = " + totalArea);
        scan.close();
    }

}
