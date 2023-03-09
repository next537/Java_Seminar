package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //date(); //Задание №3
        //arrMinMax(); //Задание №1
        arrVal();
    }

    private static void arrVal() {
        int val = 3;
        int[] arr = {3, 2, 2, 3};
        int[] a = arr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        numToEnd(a, arr, val);
    }

    public static void numToEnd(int[] a, int[] arr, int val) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                a[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < a.length; i++) {
            a[i] = val;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }



    private static void arrMinMax() {
        int[] arr = {5, 10, 1, 4, 24};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
    }


    private static void date() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println("Введите временной интервал: ");
        int a = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        switch (a) {
            case (0):
                System.out.println("Доброе утро, " + name); // если время от 05:00 до 11:59
                break;
            case (1):
                System.out.println("Добрый день, " + name); // если время от 12:00 до 17:59;
                break;
            case (2):
                System.out.println("Добрый вечер, " + name); //если время от 18:00 до 22:59;
                break;
            case (3):
                System.out.println("Доброй ночи, " + name); //если время от 23:00 до 4:59
                break;
        }
    }
}
