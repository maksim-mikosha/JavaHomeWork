public class program6 {
    public static void main(String[] args) {
        Integer[] intArr = { 10, 12, 32, 5 };
        // Проверка методов
        if (offerFirst(4, intArr)) {
            System.out.println("Done!");
        } else {
            System.out.println("Something is wrong");
        }
        if (offerLast(13, intArr)) {
            System.out.println("Done!");
        } else {
            System.out.println("Something is wrong");
        }
        System.out.println("First element is - " + peekFirst(intArr));
        System.out.println("Last element is - " + peekLast(intArr));

        if (pollFirst(intArr) != null) {
            System.out.printf("Done! First element %d was deleted \n", pollFirst(intArr));
        } else {
            System.out.println("Array is empty!");
        }

        if (pollLast(intArr) != null) {
            System.out.printf("Done! Last element %d was deleted \n", pollLast(intArr));
        } else {
            System.out.println("Array is empty!");
        }
    }

    public static boolean offerFirst(Integer element, Integer[] array) {
        Integer[] tempArr = new Integer[array.length + 1];
        if (tempArr.length <= 5) {
            tempArr[0] = element;
            for (int i = 1; i < tempArr.length; i++) {
                tempArr[i] = array[i - 1];
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean offerLast(Integer element, Integer[] array) {
        Integer[] tempArr = new Integer[array.length + 1];
        if (tempArr.length <= 5) {
            tempArr[array.length] = element;
            for (int i = 0; i < array.length; i++) {
                tempArr[i] = array[i];
            }
            return true;
        } else {
            return false;
        }
    }

    public static Integer peekFirst(Integer[] array) {
        if (array.length == 0) {
            return null;
        } else {
            return array[0];
        }
    }

    public static Integer peekLast(Integer[] array) {
        if (array.length == 0) {
            return null;
        } else {
            return array[array.length - 1];
        }
    }

    public static Integer pollFirst(Integer[] array) {
        if (array.length != 0) {
            Integer[] tempArr = new Integer[array.length - 1];
            for (int i = 1; i < array.length - 1; i++) {
                tempArr[i] = array[i - 1];
            }
            return array[0];
        } else {
            return null;
        }
    }

    public static Integer pollLast(Integer[] array) {
        if (array.length != 0) {
            Integer[] tempArr = new Integer[array.length - 1];
            for (int i = 0; i < array.length - 2; i++) {
                tempArr[i] = array[i];
            }
            return array[array.length - 1];
        } else {
            return null;
        }
    }
}
