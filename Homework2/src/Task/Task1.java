//Реализуйте алгоритм сортировки пузырьком числового массива,
//        результат после каждой итерации запишите в лог-файл.
//        (через FileWriter).
package Task;

import java.io.FileWriter;
import java.util.Arrays;

public class Task1 {
    public static void bubbleSort() {
        StringBuilder builder = new StringBuilder();
        int[] arr = {5, 3, 8, 1, 7, 2};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                builder.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter writer = new FileWriter("log.txt", false);
                    writer.write(builder.toString());
                    writer.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}