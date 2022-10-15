package src;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {

        ArrayList<Notebook> fullList = new ArrayList<>();
        fullList.add(new Notebook("1", "Air","8","8", "256", "gray"));
        fullList.add(new Notebook("2", "MagicBook","16", "16", "512", "midnigth"));
        fullList.add(new Notebook("3", "MagicBook","16", "8", "512", "silver"));
        fullList.add(new Notebook("4", "MacBookPro","24", "16", "512", "silver"));
        fullList.add(new Notebook("5", "Air","16", "8", "512", "spacegray"));
        fullList.add(new Notebook("6", "MacBookPro","32", "32", "1024", "midnigth"));

        Scanner in = new Scanner(System.in);

        System.out.println("Список ноутбуков:" + fullList);

        System.out.println("Введите параметр для поиска: ");
        String userFilterField = in.next();
        System.out.println("Введите значение: ");
        String userFilterValue = in.next();
        in.close();

        NotebookController controller = new NotebookController();

        System.out.println(controller.getFindNotebookList(fullList,userFilterField,userFilterValue));
//        System.out.println(controller.sortedNotebook(fullList));
    }
}