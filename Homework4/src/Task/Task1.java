//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Task;

import java.util.LinkedList;

public class Task1 {
    public static void reverseLinkedList (LinkedList<Integer> linkedList) {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revLinkedList.add(linkedList.get(i));
        }
        System.out.println(revLinkedList);
    }
}
