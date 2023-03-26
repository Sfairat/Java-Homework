import Task.Task1;
import Task.Task2;

public class Main {
    public static void main(String[] args) {
        Task1.bubbleSort();
        String allStudents = "фамилия: Иванов, оценка: 5, предмет: Математика, фамилия: " +
                "Петрова,оценка: 4,предмет: Информатика, фамилия: Краснов, " +
                "оценка: 5, предмет: Физика";
        System.out.println(Task2.stringParse(allStudents));
    }
}