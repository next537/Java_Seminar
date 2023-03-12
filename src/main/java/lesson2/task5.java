package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class task5 {
    static Logger logger = Logger.getLogger("task5");

    public static void main(String[] args) {
        ex5("D:\\Учебное IT\\GB\\!Пакет Разработчик\\Разработчик - Тестировщик\\1 четверть. Общие материалы 2 Блока\\4 Java знакомство и как пользоваться базовым API (семинары)\\Урок 1. Знакомство с языком программирования Java\\seminar\\java-practic");
    }

    private static void ex5(String pathDir) {
        String[] filesNamesFromDir = new String[0];
        try {
            filesNamesFromDir = convertPathToNamesArr(pathDir);
        } catch (Exception e) {
            logger.severe(e.getMessage());
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();
        for (String fileName : filesNamesFromDir) {
            sb.append(fileName).append(System.lineSeparator());
        }

//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter("src/main/resources/files/lesson2_5.txt");
//            pw.print(sb);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            pw.close();
//        }

        File output = new File("src/main/resources/files/lesson2_5.txt");
        try (PrintWriter pw = new PrintWriter(output)) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            logger.warning(e.getMessage());
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
        }
    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        try {
            if (!dir.isDirectory()) {
                throw new RuntimeException("По указанному пути не было найдено директории " + path);
            }
            return dir.list();
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}