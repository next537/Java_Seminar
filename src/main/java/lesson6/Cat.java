package lesson6;

import lombok.Getter;

import java.util.Objects;


@Getter

public class Cat {
    int id;
    String name;
    double age;
    String bleed;
    String color;


    //Для вызова конструктора (что бы не менялся порядок), вызываем его сочетанием клавиш Alt+Insert > Constructor и выбираем поля
    public Cat(int id, String name, double age, String bleed, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bleed = bleed;
        this.color = color;
    }

    public Cat(int id, String name) { //Можно создать несколько конструкторов если необходимо что бы были заполнены только опреденные поля
        this.id = id;
        this.name = name;
    }

    //в зависимости от того сколько приходит аргументов будет вызван один из конструкторов


    //Генерация сравнения экземпляров: Alt+Insert > Constructor


    @Override
    public boolean equals(Object o) { //метод сравнения
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && Double.compare(cat.age, age) == 0 && name.equals(cat.name) && bleed.equals(cat.bleed) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, bleed, color);
    }

    public void printInfo() { //Инфа о коте
        System.out.println(toString());
    }

    public String toString() {
        return String.format("Кличка: %s, возраст: %s, порода: %s, окрас: %s", name, age, bleed, color);
    }


}
