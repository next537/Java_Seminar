package lesson1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        date();
    }

    private static void date() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println("Введите временной интервал: ");
        int a = 0;
        iScanner.close();
        switch (a){
            case(0):
                System.out.println("Доброе утро, " + name); // если время от 05:00 до 11:59
                break;
            case(1):
                System.out.println("Добрый день, " + name); // если время от 12:00 до 17:59;
                break;
            case(2):
                System.out.println("Добрый вечер, " + name); //если время от 18:00 до 22:59;
                break;
            case(3):
                System.out.println("Доброй ночи, " + name); //если время от 23:00 до 4:59
                break;
        }
    }
}
