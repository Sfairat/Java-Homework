import Task.Task1;
import Task.Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        Task1.reverseLinkedList(linkedList);

        System.out.println("Наша очередь: " + linkedList + ".");
        Task2.enqueue(linkedList);
        Task2.first(linkedList);
        Task2.dequeue(linkedList);
    }
}