//Реализуйте структуру телефонной книги с помощью HashMap,
//учитывая, что 1 человек может иметь несколько телефонов.

package Task;

import java.util.ArrayList;
import java.util.Map;

public class Task1 {
    public static void fillMap(Map<String, ArrayList<String>> stringArrayListMap) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        String name = "Вася";
        arrayList1.add("+7(495)7918329");
        arrayList1.add("+7(903)9978185");
        stringArrayListMap.put(name, arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        name = "Коля";
        arrayList2.add("+7(495)1285493");
        arrayList2.add("+7(926)9624391");
        arrayList2.add("+7(977)4619081");
        stringArrayListMap.put(name, arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();
        name = "Петя";
        arrayList3.add("+7(495)2981084");
        stringArrayListMap.put(name, arrayList3);
    }

    public static void printValues(Map<String, ArrayList<String>> map)
    {
        fillMap(map);
        for(Map.Entry<String, ArrayList<String>> pair : map.entrySet())
        {
            String key = pair.getKey();
            ArrayList<String> value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
