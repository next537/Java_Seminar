package lesson3.lesson3;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //arrayList();
        //randomNum(); //Задание 1
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto"); // Задание 2
        planetRandom(names); //Задание 2
    }

    private static List<String> planetRandom(List str) {
        List<String> planets = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            var random = new SecureRandom();
            var randomElement = str.get(random.nextInt(str.size()));
            planets.add((String) randomElement);
        }
        planets.sort(Comparator.naturalOrder());
        int count = 1;
        for (int i = 0; i < planets.size() - 1; i++) {
            if (planets.get(i).equals(planets.get(i + 1))) {
                count++;
            } else {
                System.out.println(planets.get(i) + " " + count);
                count = 1;
            }
        }
        return planets;
    }

    private static void randomNum() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            int n = (int) ((Math.random() * (60 - 0)) + 0);
            numbers.add(n);
        }
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);
    }

    private static void arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //List<Integer> arrayList = new ArrayList<>(); // то же что и ArrayList
        arrayList.add(3); //добавить
        arrayList.add(3);
        arrayList.add(3);

        //arrayList.sort(); //можно находить мин и макс
        Collections.sort(arrayList, Collections.reverseOrder()); //выбираем что сортируем и как сортируем

        Collections.addAll(arrayList, 1, 2, 3, 4, 5, 6, 7, 8); //добавить все указанные элементы

        System.out.println(arrayList);

        arrayList.stream().filter(n -> n % 2 == 0).forEach(System.out::println); //вывод только четных чисел
    }


}
