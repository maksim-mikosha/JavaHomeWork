// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Map<String, String> spr = new HashMap<>();
        Scanner in = new Scanner(System.in, "Cp866");
        boolean start = true;
        System.out.println("Справочник пуст. Давай наполнять.");
        while (start) {
            System.out.print("Введите ФИО (например - Иванов И.И.): ");
            String fullName = in.nextLine();
            System.out.print("Введите номер телефона (например - (ххх)123-45-67): ");
            String number = in.nextLine();
            if (spr.size() >= 1) {
                if (spr.containsKey(fullName)) {
                    System.out.printf("В справочнике уже есть %s \n", fullName);
                    System.out.println("Я это предвидел) Добавляем.");
                    spr.put(fullName, spr.get(fullName).concat(", " + number));
                } else {
                    spr.put(fullName, number);
                }
            } else {
                spr.put(fullName, number);
            }
            System.out.println("Текущий состав каталога" + spr);
            System.out.println("Хотите продолжить? \"Да\" - Для продожения \"Нет\" - Для выхода");
            String inputCommand = in.nextLine();
            if (inputCommand.equalsIgnoreCase("да")) {
                System.out.println("Ок. Продолжим");
            } else if (inputCommand.equalsIgnoreCase("нет")) {
                System.out.println("Пока-пока");
                start = false;
            } else {
                System.out.println("Вы ввели что-то не понятное для меня. Goodbye!");
                start = false;
            }
        }
        in.close();
    }
}