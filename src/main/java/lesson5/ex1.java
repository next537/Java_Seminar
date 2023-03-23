//Задача №1 Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package lesson5;

import java.util.HashMap;
import java.util.List;

public class ex1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInBook();
        findInBook("Савина");
    }

    public static void addInBook() {
        phoneBook.put("Иванов", List.of("+7 (881) 720-12-13", "+7 (502) 240-73-81"));
        phoneBook.put("Белова", List.of("+7 (236) 278-31-35", "+7 (779) 654-10-27"));
        phoneBook.put("Юрин", List.of("+7 (740) 715-74-61", "+7 (492) 914-81-47"));
        phoneBook.put("Мусина", List.of("+7 (253) 521-80-02"));
        phoneBook.put("Савина", List.of("+7 (294) 369-87-04", "+7 (135) 730-03-87"));
        phoneBook.put("Иванова", List.of("+7 (834) 428-07-98"));
    }

    public static void findInBook(String surname) {
        System.out.printf("Результат поиска: " + "\n%s: %s", surname, phoneBook.get(surname));
    }

}
