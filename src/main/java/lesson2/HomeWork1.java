//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class HomeWork1 {
    static Logger logger = Logger.getLogger("HomeWork1");
    public static void main(String[] args) {
        hw1();
    }

    private static void hw1() {
        StringBuilder sb = new StringBuilder();
        String str = "TEST";
        int count = 1;
        for (int i = 0; i < 100; i++) {
            sb.append(count);
            sb.append(" ");
            sb.append(str);
            count++;
            sb.append(System.lineSeparator());
        }
        String result = sb.toString();
        //System.out.println(result);
        File output = new File("src/main/resources/files/HW1.txt");
        try (PrintWriter pw = new PrintWriter(output)) {
            pw.print(result);
        } catch (FileNotFoundException e) {
            logger.warning(e.getMessage());
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
        }
    }
}
