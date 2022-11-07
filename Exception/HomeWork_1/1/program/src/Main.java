/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class Main {
    public static void main(String[] args) {
        int[] ArrayFirst = {12, 14, 2, 6, 7};
        int[] ArraySecond = {1, -2, 3, 15, 7};
        int[] ArrayResult = new int[ArrayFirst.length];
        if (ArrayFirst.length != ArraySecond.length) {
            throw new RuntimeException("Массивы не равны! Не могу посчитать");
        } else {
            ArrayResult = calcArrays(ArrayFirst,ArraySecond);
            System.out.print("Результирующий массив - ");
            for (int j : ArrayResult) {
                System.out.print(j + " ");
            }
        }
    }

    private static int[] calcArrays(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            tempArray[i] = array1[i] - array2[i];
        }
        return tempArray;
    }
}