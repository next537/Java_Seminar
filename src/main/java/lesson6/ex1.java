package lesson6;

import java.util.HashSet;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        System.out.println(countPercentUniq(createArray()));
    }

    private static double countPercentUniq(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : array) {
            set.add(j);
        }
        System.out.println(set);
        return (double) set.size() * 100 / array.length;
    }

    private static int[] createArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
