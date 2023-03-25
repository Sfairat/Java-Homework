//n! (произведение чисел от 1 до n)

package Task;

import java.util.Scanner;

public class Task2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = scanner.nextInt();
        int fNum = 1;
        if (num == 1) {
            System.out.println(num);
        } else {
            for (int i = 1; i <= num; i++) {
                fNum *= i;
            }
            System.out.println(fNum);
        }
    }
}