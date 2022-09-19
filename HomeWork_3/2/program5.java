import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class program5 {
    public static void main(String[] args) {
        Integer[] intArr = {10, 1, 22, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(intArr);
        TreeSet<Integer> ts = new TreeSet<>(list);
        double result = 0;
        for (Integer i : list) result += i;
        result = result / list.size();
        System.out.println("Minimum value in list - " + ts.first());
        System.out.println("Maximum value in list - " + ts.last());
        System.out.println("Average in List - " + result);
    }
}