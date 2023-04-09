//Написать метод, который переводит число из римского формата записи в арабский.

package Task;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static int romanToArabic(String romanNumber) {
        int result = 0;
        int temp = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int addNumber = romanMap.get(romanNumber.charAt(i));
            if (addNumber < temp) {
                result -= addNumber;
            } else {
                result += addNumber;
            }
            temp = addNumber;
        }
        return result;
    }
}
