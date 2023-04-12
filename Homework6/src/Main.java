import Magazine.Notebook;

import java.util.*;

import static Magazine.Stock.*;

public class Main {
    public static void main(String[] args) {
        note1.setPrice(18000);
        note2.setPrice(8000);
        note3.setPrice(16000);
        note4.setPrice(12000);
        note5.setPrice(15000);
        note6.setPrice(10000);
        note7.setPrice(20000);

        note1.setBrand("Acer");
        note2.setBrand("Lenovo");
        note3.setBrand("Asus");
        note4.setBrand("HP");
        note5.setBrand("Samsung");
        note6.setBrand("Huawei");
        note7.setBrand("Macbook");

        HashSet<Notebook> notebooks = new HashSet<>(Arrays.asList(note1, note2, note3, note4, note5, note6, note7));
        HashSet<Notebook> output = new HashSet<>();
        HashMap<String, Object> searchCriteria = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Введите число: 1 - выбор критерия поиска по объему оперативной памати,
                 2 - выбор критерия поиска по обему жесткого диска,
                 3 - выбор критерия поиска по операцинной системе,
                 4 - выбор критерия поиска по цене,
                 5 - выбор критерия поиска по цвету,
                 6 - начало поиска.""");
        int choice = sc.nextInt();
        Object filter;

        while (choice != 6) {
            if (choice == 1) {
                System.out.println("Введите минимальный объем оперативной памяти");
                filter = sc.nextInt();
                searchCriteria.put("RAM", filter);
            }
            if (choice == 2) {
                System.out.println("Введите минимальный объем жесткого диска");
                filter = sc.nextInt();
                searchCriteria.put("HDD", filter);
            }
            if (choice == 3) {
                System.out.println("Введите тип операционной системы");
                filter = sc.next();
                searchCriteria.put("OS", filter);
            }
            if (choice == 4) {
                System.out.println("Введите минимальную цену");
                filter = sc.nextInt();
                searchCriteria.put("Price", filter);
            }
            if (choice == 5) {
                System.out.println("Введите цвет");
                filter = sc.next();
                searchCriteria.put("Color", filter);
            }
            System.out.println("""
                 Введите число: 1 - выбор критерия поиска по объему оперативной памати,
                 2 - выбор критерия поиска по обему жесткого диска,
                 3 - выбор критерия поиска по операцинной системе,
                 4 - выбор критерия поиска по цене,
                 5 - выбор критерия поиска по цвету,
                 6 - начало поиска.""");
                choice = sc.nextInt();
        }
        for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                for (Notebook userChoice : notebooks) {
                    if (userChoice.getRam() >= (Integer) entry.getValue()) {
                        output.add(userChoice);
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
            if (entry.getKey().equals("HDD")) {
                for (Notebook userChoice : notebooks) {
                    if (userChoice.getHdd() >= (Integer) entry.getValue()) {
                        output.add(userChoice);
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
            if (entry.getKey().equals("OS")) {
                for (Notebook userChoice : notebooks) {
                    if (userChoice.getOs().equals(entry.getValue())) {
                        output.add(userChoice);

                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
            if (entry.getKey().equals("Price")) {
                for (Notebook userChoice : notebooks) {
                    if (userChoice.getPrice() >= (Integer) entry.getValue()) {
                        output.add(userChoice);
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
            if (entry.getKey().equals("Color")) {
                for (Notebook userChoice : notebooks) {
                    if (userChoice.getColor().equals(entry.getValue())) {
                        output.add(userChoice);
                    }
                }
            }
        }
        for (Notebook notebook : output) {
            System.out.println(notebook);
        }
    }
}