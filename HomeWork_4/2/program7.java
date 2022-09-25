import java.util.Arrays;
import java.util.LinkedList;

public class program7 {
    public static void main(String[] args) {
        String str = "(()())(())";
        String resultString = "";
        LinkedList<String> listString = new LinkedList<String>(Arrays.asList(str.split("")));
        listString.pollFirst();
        listString.pollLast();
        if (listString.size() == 2) {
            if (listString.get(0).equals("(") && listString.get(1).equals(")")) {
                return;
            } else {
                listString.pollFirst();
                listString.pollFirst();
            }
        } else {
            for (int i = 0; i < listString.size() - 1; i++) {
                if ((listString.get(i).equals(")") && listString.get(i + 1).equals(")")) ||
                        (listString.get(i).equals("(") && listString.get(i + 1).equals("("))) {
                    listString.remove(i);
                }
            }
        }
        for (String string : listString) {
            resultString = resultString.concat(string.toString());
        }
        System.out.println(resultString);
    }
}