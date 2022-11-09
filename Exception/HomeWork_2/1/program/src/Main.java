/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkInput();
    }

    public static void checkInput(){
        Scanner input = new Scanner(System.in);
        float number = 0;
        String tempString;
        boolean check = false;
        while (!check) {
            System.out.print("Input float number - ");
            tempString = input.nextLine();
            try {
                number = Float.parseFloat(tempString);
                check = true;
            } catch (Exception e) {
                System.out.println("Please, repeat!");
            }
        }
        System.out.println("Your float number is - " + number);
    }
}