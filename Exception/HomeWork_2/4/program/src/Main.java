/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = null;
        System.out.print("Введите строку - ");
        string = input.nextLine();
        if (string.length() == 0) throw new NullPointerException("Пустая строка");
        System.out.println("Строка - " + string);
    }
}