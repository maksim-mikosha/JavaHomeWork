package src;

import java.util.List;
import java.util.SortedSet;

public class NotebookController {
    private NotebookService notebookService;

    public NotebookController(){
        this.notebookService = new NotebookService();
    }

    public List<Notebook> getFindNotebookList(List<Notebook> list, String field, String value){
        return notebookService.findNotebook(list, field, value);
    }

//    public SortedSet<Notebook> sortedNotebook(List<Notebook> list){
//        return notebookService.sortedNotebook(list);
//    }
}
