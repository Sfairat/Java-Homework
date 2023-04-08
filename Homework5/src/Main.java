import Task.Task1;
import Task.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> stringArrayListMap = new HashMap<>();
        Task1.printValues(stringArrayListMap);

        System.out.println(Task2.namesArray());
        System.out.println(Task2.fillMap(Task2.namesArray()));
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(Task2.fillMap(Task2.namesArray()).entrySet());
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println(sortedList);
    }
}