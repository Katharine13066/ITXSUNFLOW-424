package by.intexsoft.study.task4;

import by.intexsoft.study.task3.Fibonacci;

import java.util.Arrays;

public class Sort {

    public static int [] createRandomArray(int n){
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int) Math.round((Math.random() * 200) - 100);
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int [] createRandomArray(int n, int a, int b){
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int) Math.round((Math.random() * b) - a);
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main (String [] args){

        bubbleSort(createRandomArray(10000));
        selectionSort(createRandomArray(10000));
        insertionSort(createRandomArray(10000));

        int [] arr = createRandomArray(10);
        mergeSort(arr, 0, 9);
        System.out.println("After merge sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");

        int [] array = createRandomArray(10);
        quickSort(array, 0,9);
        System.out.println("After quick sort");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    public static void bubbleSort(int[] array) {
        long startTime = System.currentTimeMillis();

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime-startTime) + " ms");
        System.out.println("After buble sort");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    public static void selectionSort(int[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[indexMin] = temp;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime-startTime) + " ms");
        System.out.println("After selection sort");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    public static void insertionSort(int [] array){
        long startTime = System.currentTimeMillis();
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime-startTime) + " ms");
        System.out.println("After insertion sort");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int average = (left+right)/2;
        mergeSort(array, left, average);
        mergeSort(array, average+1, right);
        merge(array, left, average, right);
    }

    static void merge(int[] array, int left, int average, int right) {
        int lengthLeft = average - left + 1;
        int lengthRight = right - average;

        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[average+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    static int quick(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int tmp = quick(array, begin, end);
        quickSort(array, begin, tmp-1);
        quickSort(array, tmp+1, end);
    }

}
