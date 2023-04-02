//Реализовать алгоритм сортировки слиянием

package Task;

import java.util.Scanner;

public class Task1 {
    public static int[] randomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int input = scanner.nextInt();
        int [] array = new int[input];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        return array;
    }

    public static void printArray(int [] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] sortedArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                sortedArray[k] = array1[i];
                k++;
                i++;
            } else {
                sortedArray[k] = array2[j];
                k++;
                j++;
            }
        }

        if (i == array1.length) {
            while (j < array2.length) {
                sortedArray[k] = array2[j];
                k++;
                j++;
            }
        }

        if (j == array2.length) {
            while (i < array1.length) {
                sortedArray[k] = array1[i];
                k++;
                i++;
            }
        }
        return sortedArray;
    }

    public static int[] mergeSort(int[] array, int firstElement, int lastElement) {
        if (firstElement == lastElement) {
            int[] element = new int[1];
            element[0] = array[firstElement];
            return element;
        }

        int middle = (firstElement + lastElement) / 2;
        int[] array1 = mergeSort(array, firstElement, middle);
        int[] array2 = mergeSort(array, middle + 1, lastElement);
        return mergeArray(array1, array2);
    }
}