package lesson6;

import java.util.Arrays;
import java.util.HashSet;

public class ex2 {
    public static void main(String[] args) {

        Cat c1 = new Cat(1,"Кошка", 3,"Британец", "Серый"); //Экземплляр кота (порядок задаёт конструктор)

        Cat c2 = new Cat(2,"Кот", 4,"Лесная", "Серый");

        Cat c3 = new Cat(3,"Котёнок", 0.5,"Двортерьер", "Белый");

        Cat c4 = new Cat(4,"Чижик", 2,"Маин-кун", "Рыжий"); //Экземплляр кота

        System.out.println(c1.equals(c3));

        System.out.println(c1.toString());

        System.out.println(c2.equals(c3));
        System.out.println(c1.hashCode());
        c4.printInfo();

        System.out.println(c1.getAge());
    }

}
