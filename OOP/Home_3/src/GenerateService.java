import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenerateService {
    public List<Relative> generate(){
        List<Relative> relativeList = new ArrayList<>();
        List<Human> collectionOfPeople = new ArrayList<>();
        collectionOfPeople.add(new Human("Ivan","Petrov",32,"M"));
        collectionOfPeople.add(new Human("Maria","Petrova",31,"F"));
        collectionOfPeople.add(new Human("Oleg","Petrov",12,"M"));
        relativeList.add(new Relative(collectionOfPeople.get(0),collectionOfPeople.get(3),Relation.SON));

        return relativeList;
    }
}
