//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void findMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Максимальное число списка: " + max);
    }

    public static void findMin(List<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальное число списка: " + min);
    }

    public static void findAverage(List<Integer> list) {
        double average = 0;
        for (Integer i : list) {
            average += i;
        }
        average = average / list.size();
        System.out.println("Среднее арифметическое списка: " + average);
    }
}