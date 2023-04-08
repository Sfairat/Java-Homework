//Пусть дан список сотрудников:
//       "Иван Иванов", "Светлана Петрова", "Кристина Белова",
//            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов",
//            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов",
//            "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
//            "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"
//        Написать программу, которая найдёт и выведет повторяющиеся имена
//        с количеством повторений. Отсортировать по убыванию популярности.

package Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    static String [] workers = new String [] {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов",
            "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
            "Иван Мечников", "Петр Петин", "Петр Лыков", "Петр Лыков", "Иван Ежов"};

    public static ArrayList<String> namesArray() {
        ArrayList<String> names = new ArrayList<>();
        for (String name: workers) {
            String [] spName = name.split(",");
            names.add(spName[0]);
        }
        return names;
    }
    public static Map<String, Integer> fillMap(ArrayList<String> names) {
        Map<String, Integer> namesMap = new HashMap<>();

        for (String name : names) {
            if (namesMap.containsKey(name)) {
                namesMap.put(name, namesMap.get(name) + 1);
            } else {
                namesMap.put(name, 1);
            }
        }
        namesMap.entrySet().removeIf(entry -> entry.getValue() == 1);
        return namesMap;
    }
}