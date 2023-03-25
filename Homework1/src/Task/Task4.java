//Реализовать простой калькулятор

package Task;

import java.util.Scanner;

public class Task4 {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println("Введите операцию (+ - * /): ");
        char operation = scanner.next().charAt(0);
        double result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                System.out.print("Результат: ");
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.print("Результат: ");
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.print("Результат: ");
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.print("Результат: ");
                System.out.println(result);
                break;
            default:
                System.out.println("Введена не верная операция!");
        }
    }
}