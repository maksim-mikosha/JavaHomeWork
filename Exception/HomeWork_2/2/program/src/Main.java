public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 5};
        int d = 4;
        if (d == 0) {
            System.out.println("Divide by zero not support. Bye!");
        } else {
            for (int i = 0; i < intArray.length; i++) {
                double catchedRes1 = Double.valueOf(intArray[i]) / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        }
    }
}