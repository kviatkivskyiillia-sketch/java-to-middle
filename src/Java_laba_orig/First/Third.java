package Java_laba_orig.First;
import java.util.Scanner;

public class Third {
    static Scanner scan;

    static int[][] Input(String matrixName) {
        System.out.println("Введіть матриці " + matrixName);
        System.out.print("Введіть розмірність n: ");
        int n = scan.nextInt();

        if (n > 20) {
            System.out.println("Розмір перевищує 20");
            n = 20;
        }

        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrixName + i + j);
                a[i][j] = scan.nextInt();
            }
        }
        return a;
    }

    static void PrintMatrix(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    static void PrintVector(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    static int[] BuildVectorX(int[][] A, int[][] B) {
        int n = A.length;
        int[] X = new int[n];

        for (int i = 0; i < n; i++) {
            int negCountA = 0;
            int negCountB = 0;

            for (int j = 0; j < n; j++) {
                if (A[i][j] < 0) {
                    negCountA++;
                }
            }

            for (int j = 0; j < n; j++) {
                if (B[i][j] < 0) {
                    negCountB++;
                }
            }

            if (negCountA == negCountB) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
        }

        return X;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int[][] matrixA = Input("A");
        System.out.println();

        int n = matrixA.length;
        int[][] matrixB = new int[n][n];
        System.out.println("Введення матриці B" + n + "x" + n + " ");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(i + j);
                matrixB[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nМатриця A:");
        PrintMatrix(matrixA);

        System.out.println("\nМатриця B:");
        PrintMatrix(matrixB);

        int[] vectorX = BuildVectorX(matrixA, matrixB);

        System.out.println("\nРезультат (вектор X):");
        PrintVector(vectorX);
    }
}