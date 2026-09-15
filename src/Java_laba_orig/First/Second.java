package Java_laba_orig.First;
import java.util.Scanner;

public class Second {
    static Scanner scan;

    static int[] Input() {
        System.out.println("Розмір масиву:");
        int n = scan.nextInt();

        if (n > 400) {
            System.out.println("Масив перевищує 400");
            n = 400;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = scan.nextInt();
        }
        return a;
    }

    static void Print(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void FindMaxUnique(int[] a) {
        boolean found = false;
        int maxUnique = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                if (!found || a[i] > maxUnique) {
                    maxUnique = a[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Максимальне неповторюване число: " + maxUnique);
        } else {
            System.out.println("У масиві немає унікальних чисел.");
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int[] myArray = Input();

        System.out.println("Масив:");
        Print(myArray);

        FindMaxUnique(myArray);

        scan.close();
    }
}