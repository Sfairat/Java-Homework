//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static List<Integer> randomList() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int input = scanner.nextInt();
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            int value = random.nextInt(1, 11);
            myList.add(value);
        }
        System.out.printf(String.valueOf(myList));
        System.out.println("\n");
        return myList;
    }

    public static void elementRemove(List<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}