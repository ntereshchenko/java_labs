package edu.ntudp.fit.lab2;

import java.util.Random;
import java.util.Scanner;

public class MatrixOfElements {
    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                                  
                Choose how to create a matrix:
                1. Type from the keyboard:
                2. Generate randomly:
                 """);

        int choice = scanner.nextInt();

        int[][] matrix;

        switch (choice) {
            case 1:
                matrix = createMatrixFromInput(scanner);
                break;
            case 2:
                matrix = createRandomMatrix();
                break;
            default:
                System.out.println("Wrong choice. Ending the program.");
                return;
        }

        printMatrix(matrix);

        int minimum = findMinimumElement(matrix);
        int maximum = findMaximumElement(matrix);
        double averageValue = calculateArithmeticAverage(matrix);
        double geometricAverageValue = calculateGeometricAverage(matrix);

        System.out.println("Minimal element: " + minimum);
        System.out.println("Maximum element: " + maximum);
        System.out.println("Arithmetic average: " + averageValue);
        System.out.println("Geometric average: " + geometricAverageValue);

        scanner.close();
    }

    private static int[][] createMatrixFromInput(Scanner scanner) {
        System.out.println("Enter the width of the matrix (no more than " + MAX_SIZE + "):");
        int width = scanner.nextInt();
        System.out.println("Enter the height of the matrix (no more than " + MAX_SIZE + "):");
        int height = scanner.nextInt();

        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("The matrix dimensions exceed the permissible values. The program ends.");
            System.exit(1);
        }

        return readMatrixFromInput(scanner, width, height);
    }

    private static int[][] readMatrixFromInput(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];

        System.out.println("enter the elements of the matrix:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] createRandomMatrix() {
        Random random = new Random();
        int width = random.nextInt(MAX_SIZE) + 1;
        int height = random.nextInt(MAX_SIZE) + 1;

        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("The resulting matrix:");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static int findMinimumElement(int[][] matrix) {
        int minimum = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value < minimum) {
                    minimum = value;
                }
            }
        }

        return minimum;
    }

    private static int findMaximumElement(int[][] matrix) {
        int maximum = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > maximum) {
                    maximum = value;
                }
            }
        }

        return maximum;
    }

    private static double calculateArithmeticAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }

        return (double) sum / count;
    }

    private static double calculateGeometricAverage(int[][] matrix) {
        int product = 1;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                product *= value;
                count++;
            }
        }

        return Math.pow(product, 1.0 / count);
    }
}
