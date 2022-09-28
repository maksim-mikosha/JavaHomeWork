// Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны “потеряться”.
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;

public class program9 {
    public static void main(String[] args) {
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        TreeMap<Integer, LinkedList<String>> trMap = new TreeMap<>();
        LinkedList<String> list = new LinkedList<>(Arrays.asList(str.split(" ")));
        for (String string : list) {
            int count = string.length();
            if (trMap.containsKey(count)) {
                trMap.get(count).add(string);
            } else {
                trMap.put(count, new LinkedList<>(Arrays.asList(string)));
            }
        }
        System.out.println(trMap);
    }
}