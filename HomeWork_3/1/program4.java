import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program4 {
    public static void main(String[] args) {
        Integer[] intArr = {3, 12, 32, 5, 6, 7, 11, 10, 13, 3, 8 , 8};
        List<Integer> list = Arrays.asList(intArr);
        List<Integer> resultList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                resultList.add(i);
            }
        }
        System.out.println(resultList);
    }
}