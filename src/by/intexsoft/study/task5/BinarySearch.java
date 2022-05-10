package by.intexsoft.study.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) throws FileNotFoundException {
        int n, item, array[], first, last;

        Scanner scanner = new Scanner(new File("input.txt"));
        n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        System.out.println("Original array");
        printArray(array, n);

        Arrays.sort(array);
        System.out.println("Sorted array");
        printArray(array, n);

        System.out.println("Enter element for binary search: ");
        Scanner input = new Scanner(System.in);
        item = input.nextInt();
        first = 0;
        last = n - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
       binarySearch(array, first, last, item);
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int average;
        int comparisonCount = 1;

        average = (first + last) / 2;

        while ((array[average] != item) && (first <= last)) {
            comparisonCount++;
            if (array[average] > item) {
                last = average - 1;
            } else {
                first = average + 1;
            }
            average = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++average + " element in array");
            System.out.println("Comparison count " + comparisonCount);
        } else {
            System.out.println("Element not found ");
            System.out.println("Comparison count " + comparisonCount);
        }
    }

    public static void printArray(int  array[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
