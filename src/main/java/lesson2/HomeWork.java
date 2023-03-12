//Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
package lesson2;

public class HomeWork {
    public static void main(String[] args) {
        String str = "HomeWorkkroWemoH";
        char[] a = str.toCharArray();
        System.out.println(palindrome(a));
    }

    public static boolean palindrome(char[] str) {
        boolean palindrome = false;
        if (str.length % 2 == 0) {
            for (int i = 0; i < str.length / 2 - 1; i++) {
                if (str[i] != str[str.length - i - 1]) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        }
        return palindrome;
    }
}
