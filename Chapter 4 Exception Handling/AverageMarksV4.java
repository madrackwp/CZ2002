import java.util.Scanner;

public class AverageMarksV4 {
    public static void main(String[] args) {
        double average;
        // try {
        // average = computeAverageMarks();
        // System.out.println("Average marks = " + average);
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // } finally {
        // System.out.println("End of program execution!");
        // }

        average = computeAverageMarks();
        System.out.println("Average marks = " + average);

    }

    public static double computeAverageMarks() throws ArithmeticException {
        // The throws keyword means that this method will call the ArithmeticException
        // exception handler instead of crashing the entire program
        int i, numOfStudents;
        double totalMarks = 0;
        double avgMarks = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students");
        numOfStudents = sc.nextInt();

        // if (numOfStudents <= 0)
        // throw new ArithmeticException("Error: no of students must not equal 0!");
        System.out.print("Enter students marks: ");
        for (i = 0; i < numOfStudents; i++) {
            totalMarks += sc.nextDouble();

        }
        avgMarks = totalMarks / (double) numOfStudents;
        return avgMarks;

    }

}