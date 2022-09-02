import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        boolean start = true;
        Scanner in = new Scanner(System.in,"Cp866");
        while (start) {
            System.out.print("Введите первое число: ");
            int firstNumber = in.nextInt();
            System.out.print("Введите второе число: ");
            int secondNumber = in.nextInt();
            System.out.print("Введите какую операцию хотите произвести ");
            String operation = in.next();
            switch (operation) {
                case "+":
                    System.out.println("Выбрано сложение");
                    System.out.printf("Сумма %d и %d = %d \n", firstNumber, secondNumber, firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.println("Выбрано вычитание");
                    System.out.printf("Разница между %d и %d = %d \n", firstNumber, secondNumber,
                            firstNumber - secondNumber);
                    break;
                case "*":
                    System.out.println("Выбрано умножение");
                    System.out.printf("Умножение %d на %d = %d \n", firstNumber, secondNumber,
                            firstNumber * secondNumber);
                    break;
                case "/":
                    System.out.println("Выбрано деление");
                    System.out.printf("Деление %d на %d = %.2f \n", firstNumber, secondNumber,
                            (double) firstNumber / secondNumber);
                    break;
            }
            System.out.println("Хотите продолжить? \"Да\" - Для продожения \"Нет\" - Для выхода");
            String inputCommand = in.next().toLowerCase();
            if (inputCommand.equals("да")) {
                System.out.println("Ок. Давайте еще раз");
            } else if (inputCommand.equals("нет")) {
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