//Задание 1
//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

//Задание 2
//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.

package lesson4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //remember();//Задание 1
        revent();//Задание 2
    }

    private static void revent() {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            int val = random.nextInt(0, 50);
            list.add(val);
        }
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.print(list.getLast() + " ");
            list.removeLast();
        }
    }

    private static void remember() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        String[] rem = new String[1];
        System.out.println("Введите значение\nДля выхода используйте 'print'");
        do {
            wordsList.addFirst(rem[0]);
        }
        while (!(rem[0] = in.nextLine()).equals("print"));
        do {
            wordsList.removeLast();
        }
        while (!(rem[0] = in.nextLine()).equals("revent"));

        in.close();
        System.out.println("Перевернутый LinkedList: " + wordsList.toString());
    }
}
