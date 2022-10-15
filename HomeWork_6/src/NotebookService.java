package src;

import java.util.*;

public class NotebookService {
    public List<Notebook> findNotebook(List<Notebook> list, String field, String value) {
        List<Notebook> foundListOfNotebook = new ArrayList<>();
        for (Notebook notebook : list) {
            switch (field) {
                case "id":
                    if (notebook.getId().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;

                case "cpu":
                    if (notebook.getCpu().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;

                case "model":
                    if (notebook.getModel().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;

                case "memory":
                    if (notebook.getMemory().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;


                case "ssd":
                    if (notebook.getSsd().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;

                case "color":
                    if (notebook.getColor().equals(value)) {
                        foundListOfNotebook.add(notebook);
                    }
                    break;
            }
        }

        return foundListOfNotebook;
    }
// Еще раз посмотреть Comparator!!!
//    public List<Notebook> sortedNotebook(List<Notebook> list) {
//        Comparator<Notebook> comparator = new Comparator<Notebook>() {
//            @Override
//            public int compare(Notebook o1, Notebook o2) {
//                return o1.getModel().compareTo(o2.getModel());
//            }
//        }
//    }
}
