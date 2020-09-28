import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {
    public static void main(final String[] args) {
        int choice;
        final Scanner scan = new Scanner(System.in);
        do {

            System.out.println("==============================================");
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.println("==============================================");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("Enter an integer");
                    int a = scan.nextInt();
                    System.out.println("Enter the quotient");
                    int b = scan.nextInt();
                    int solution = divide(a, b);
                    System.out.println(a + " / " + b + " = " + solution);
                    break;
                case 3:
                    System.out.println("Enter an integer to be modded");
                    int c = scan.nextInt();
                    System.out.println("Enter the modulo");
                    int d = scan.nextInt();
                    int solutionMod = modulus(c, d);
                    System.out.println(c + " % " + d + " = " + solutionMod);
                    break;
                case 4:
                    System.out.println("Enter an integer");
                    int input = scan.nextInt();
                    int solutionCount = countDigits(input);
                    if (solutionCount < 0) {
                        System.out.println("Error input!");
                    } else {
                        System.out.println("Count = " + solutionCount);
                    }

                    break;
                case 5:
                    System.out.println("Enter an integer");
                    int inputInt = scan.nextInt();
                    System.out.println("What integer are you looking for?");
                    int num = scan.nextInt();
                    int solutionPos = position(inputInt, num);
                    System.out.println("Position: " + solutionPos);
                    break;
                case 6:
                    System.out.println("Enter a integer and all odd numbers will be returned");
                    long userInput = scan.nextLong();
                    if (userInput < 0) {
                        System.out.println("Error Input!");
                    } else {
                        long answer = extractOddDigits(userInput);
                        if (answer == 0) {
                            System.out.println("Odd Digits= -1");
                        } else {
                            System.out.println(answer);
                        }
                    }

                    break;
                case 7:
                    System.out.println("Program terminating ...");
            }
        } while (choice < 7);
    }

    public static void mulTest() {
        final Scanner scan = new Scanner(System.in);
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int correct = 0;

        for (int x = 0; x < 5; x++) {
            int a = (int) (Math.random() * range) + min;
            int b = (int) (Math.random() * range) + min;
            // System.out.println(a + " + " + b);
            int prod = a * b;
            System.out.println("How much is " + a + " times " + b + "?");
            int userAns = scan.nextInt();
            if (userAns == prod) {
                correct++;
            }
        }
        System.out.println(correct + " answers out of 5 are correct!");
    }

    public static int divide(int m, int n) {
        int solution = 0;
        if (n > m) {
            return solution;
        }

        while (m >= n) {
            m -= n;
            solution++;
        }
        return solution;
    }

    public static int modulus(int m, int n) {
        if (n > m) {
            return m;
        }
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n < 0) {
            return -1;
        }

        int solution = 0;
        while (n != 0) {
            n /= 10;
            solution++;
        }
        return solution;
    }

    public static int position(int n, int digit) {
        int index = 0;
        int len = Integer.toString(n).length();

        for (int i = index + 1; i <= len; i++) {
            int checkNo = n % 10;

            // System.out.println(checkNo);
            if (checkNo == digit) {
                index = i;
                break;
            }
            n = n / 10;
        }
        if (index == 0) {
            return -1;
        }
        return index;
    }

    public static long extractOddDigits(long n) {
        long solution = 0;
        int len = Long.toString(n).length();
        for (int i = 1; i <= len; i++) {
            long checkNo = (n / (int) Math.pow(10, len - i) % 10);
            // System.out.println(checkNo);
            if (checkNo % 2 == 1) {
                solution = solution * 10 + checkNo;
            }
        }
        return solution;
    }
}
