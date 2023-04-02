// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Task;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void enqueue(LinkedList<Integer> linkedList) {
        Random random = new Random();
        int num = random.nextInt(4, 11);
        linkedList.addLast(num);
        System.out.println("Последний элемент в очереди теперь: " + num + ".");
        System.out.println("Наша очередь теперь: " + linkedList + ".");
    }

    public static void dequeue(LinkedList<Integer> linkedList) {
        int num = linkedList.get(0);
        linkedList.remove(0);
        System.out.println("Удален первый элемент в очереди: " + num + ".");
        System.out.println("Наша очередь теперь: " + linkedList + ".");
    }

    public static void first(LinkedList<Integer> linkedList) {
        int num = linkedList.get(0);
        System.out.println("Первый элемент в очереди: " + num + ".");
    }
}
