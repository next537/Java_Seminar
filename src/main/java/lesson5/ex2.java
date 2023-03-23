// Задача №2  Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        String employeesList = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] list = employeesList.split(" ");
        for (int i = 0; i < list.length; i += 2) {
            if (employee.containsKey(list[i])) {
                employee.replace(list[i], employee.get(list[i]) + 1);
            } else {
                employee.put(list[i], 1);
            }
        }
        System.out.println("Имена с количеством повторений: \n" + employee);

        Map<String, Integer> sortedList = new LinkedHashMap<>();
        int max = 1;
        for (int value : employee.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : employee.entrySet()) {
                String key = entry.getKey();
                if (employee.get(key) == i) {
                    sortedList.put(key, employee.get(key));
                }
            }
        }
        System.out.println("Сортировка имён по популярности: \n" + sortedList);
    }
}
