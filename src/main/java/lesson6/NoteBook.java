package lesson6;

import lombok.Getter;

@Getter
public class NoteBook {

    int price;
    String manufacturer;
    int ram;
    int hdd;
    String color;
    double diagonal;

    public NoteBook(int price, String manufacturer, int ram, int hdd, String color, double diagonal) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.diagonal = diagonal;
    }

    public boolean printInfo() {
        System.out.println(toString());
        return false;
    }

    public String toString() {
        return String.format("Цена: %s, Производитель: %s, Оперативная память (ГБ): %s, Объем жесткого диска (ГБ): %s", price, manufacturer, ram, hdd, color);
    }

}