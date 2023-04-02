import Task.Task1;
import Task.Task2;
import Task.Task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] array = Task1.randomArray();
        int [] mergedArray = Task1.mergeSort(array, 0, array.length - 1);
        Task1.printArray(mergedArray);

        List<Integer> list1 = Task2.randomList();
        Task2.elementRemove(list1);
        System.out.print("Список без четных чисел: ");
        System.out.println(list1);

        List<Integer> list2 = Task2.randomList();
        Task3.findMax(list2);
        Task3.findMin(list2);
        Task3.findAverage(list2);
    }
}