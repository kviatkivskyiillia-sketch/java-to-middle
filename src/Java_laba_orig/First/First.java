package Java_laba_orig.First;

import java.util.Scanner;

public class First {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("a = ");
        double a = scan.nextDouble();

        System.out.println("b = ");
        double b = scan.nextDouble();

        double result = (a / (Math.pow(b, 2) - 2)) + (b / (Math.pow(a, 2) + 2)) + Math.pow(a * b, 3);

        System.out.println("Result = " + result);
    }
}