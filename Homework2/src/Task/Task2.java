//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и,
//        используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

package Task;

import java.util.Arrays;

public class Task2 {
    public static String stringParse (String arg) {
        StringBuilder builder = new StringBuilder();
        String [] students = arg.split(",");
        String [] line = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < line.length; i++) {
            String [] tempSplitLines = students[i].split(":");
                builder.append(line[i]);
                builder.append(tempSplitLines[1]);
        }
        builder.append("\n");
        for (int j = 0; j < students.length - 3; j++) {
            students[j] = students[j + 3];
        }
        for (int i = 0; i < line.length; i++) {
            String[] tempSplitLines = students[i].split(":");
            builder.append(line[i]);
            builder.append(tempSplitLines[1]);
        }
        builder.append("\n");
        for (int k = 0; k < students.length - 3; k++) {
            students[k] = students[k + 3];
        }
        for (int i = 0; i < line.length; i++) {
            String[] tempSplitLines = students[i].split(":");
            builder.append(line[i]);
            builder.append(tempSplitLines[1]);
        }
        builder.append("\n");
        return builder.toString();
    }
}