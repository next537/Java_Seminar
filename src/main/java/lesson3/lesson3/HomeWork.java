package lesson3.lesson3;

import java.util.ArrayList;
import java.util.Random;


public class HomeWork {
    public static void main(String[] args) {
        removeNum(); //Задание 1
        minMaxMedium(); //Задание 2
        strInt(); //Задание 3
    }

    private static void strInt() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("2");
        list.add(3);
        list.add("4");
        list.add(5);
        list.add("6");
        list.add(7);
        System.out.println(list);
        int i = 1;
        int length = list.toArray().length;
        while (i < length) {
            boolean b = list.get(i) instanceof Number;
            if (b) {
                list.remove(i);
                length--;
            } else {
                i++;
            }
        }
        System.out.println(list);
    }

    private static void minMaxMedium() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(0, 50);
            list.add(val);
        }
        System.out.println(list);
        int itemMax = list.get(0);
        int itemMin = list.get(0);
        int itemSum = 0;
        for (int item : list) {
            if (item > itemMax) {
                itemMax = item;
            }
            if (item < itemMin) {
                itemMin = item;
            }
            itemSum += item;
        }
        float medium = (float) itemSum / list.size();
        System.out.println("Максимальное: " + itemMax);
        System.out.println("Минимальное: " + itemMin);
        System.out.println("Сумма элементов: " + itemSum);
        System.out.println("Среднее арифметическое: " + medium);
    }

    private static void removeNum() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int val = random.nextInt(0, 50);
            list.add(val);
        }
        System.out.printf("Список целых чисел %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Список без четных чисел %s", list);
    }
}
