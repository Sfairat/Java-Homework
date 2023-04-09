import Task.Task1;
import Task.Task2;
import Task.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> stringArrayListMap = new HashMap<>();
        Task1.printValues(stringArrayListMap);

        System.out.println(Task2.namesArray());
        System.out.println(Task2.fillMap(Task2.namesArray()));
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(Task2.fillMap(Task2.namesArray()).entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(sortedList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское число: ");
        String input = scanner.next();
        System.out.println(Task3.romanToArabic(input));
    }
}