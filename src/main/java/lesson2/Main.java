package lesson2;

public class Main {
    public static void main(String[] args) {
        //sb();
        //stringN();
        String str1 = "aaabbcdd";
        //compression(str1);
    }



    private static void compression(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(array[i]);
                    count = 1;
                } else {
                    sb.append(array[i]).append(count);
                    count = 1;
                }
            }
        }
        sb.append(array[array.length - 1]).append(count);
        System.out.println(sb);
    }

    public static void stringN() {
        int n = 5;
        char first = 'a';
        char second = 'b';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }
        System.out.println(sb);
    }

    private static void sb() {
        StringBuilder sb = new StringBuilder(); //Выделить элемент и при нажатии Ctrl + B можно увидеть документацию
        //Если в скобках задать число то это будет максимальная вместимость
        for (int i = 0; i < 10000; i++) {
            //Сокращенный вариант записи. Каждый append добавляет в sb
            sb.append(i).append(": ").append((char) i).append(System.lineSeparator()); //добавление 10000 символов
            // (Номер символа, двоеточие, сам символ и перенос строки)

            //Длинный вариант записи
//            sb = sb.append(i); // Номер символа
//            sb = sb.append(": "); // двоеточие
//            sb = sb.append((char)i); // сам символ
//            sb = sb.append(System.lineSeparator()); // перенос строки
        }
        //String strResult = sb.toString(); //перевод ссылочных типов данных в строку
        System.out.println(sb);
    }
}