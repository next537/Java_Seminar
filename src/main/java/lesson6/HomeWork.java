package lesson6;

import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        NoteBook n1 = new NoteBook(23783, "IRU", 2, 512, "Black", 15.6);
        NoteBook n2 = new NoteBook(27538, "Lenovo", 4, 1024, "Gray", 15.6);
        NoteBook n3 = new NoteBook(57864, "Asus", 16, 2048, "White", 14);
        NoteBook n4 = new NoteBook(58942, "HP", 12, 2048, "Black", 17);
        NoteBook n5 = new NoteBook(26789, "IRU", 3, 512, "White", 15.6);
        NoteBook n6 = new NoteBook(34896, "Lenovo", 8, 2048, "Gray", 15.6);
        NoteBook n7 = new NoteBook(106798, "Asus", 36, 5120, "Black", 14);
        NoteBook n8 = new NoteBook(15067, "HP", 1, 128, "Red", 10);

        List<NoteBook> noteBookList = List.of(n1, n2, n3, n4, n5, n6, n7, n8);
        List<String> noteBookListManufacture = List.of(n1.manufacturer, n2.manufacturer, n3.manufacturer, n4.manufacturer, n5.manufacturer, n6.manufacturer, n7.manufacturer, n8.manufacturer);
        ;
        List<String> noteBookListColor = List.of(n1.color, n2.color, n3.color, n4.color, n5.color, n6.color, n7.color, n8.color);
        ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете параметр для поиска: \n1 - Производитель\n2 - Цвет");
        System.out.println("Доступные производители: " + noteBookListManufacture);
        System.out.println("Доступные цвета: " + noteBookListColor);
        int search = scanner.nextInt();
        Scanner scannerRequest = new Scanner(System.in);
        System.out.println("Напишите запрос:");
                String requestSearch = scannerRequest.nextLine();

        if (search == 1) {
            for (NoteBook manufacturer : noteBookList) {
                if (manufacturer.getManufacturer().equalsIgnoreCase(requestSearch)) {
                    System.out.println(manufacturer.printInfo());
                }
            }

        } else if (search == 2) {
            for (NoteBook color : noteBookList) {
                if (color.getColor().equalsIgnoreCase(requestSearch)) {
                    System.out.println(color.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска\n1 - Производитель\n2 - Цвет");
        }
        scanner.close();
    }
}
