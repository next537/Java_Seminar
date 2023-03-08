package lesson1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //inputName();
        arrMax1();
    }

    private static void arrMax1() {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0};
        int count = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) { //проверка на единицу увеличивается длительность последовательности
                temp++;
            } else {
                if (count < temp) {
                    count = temp;
                }
                temp = 0;
            }
        }
        if (count < temp) {
            count = temp;
        }
        System.out.println(count);
    }

    public static void inputName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println("привет, " + name + "!");
        iScanner.close();
    }
}