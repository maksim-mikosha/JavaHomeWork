import java.util.ArrayList;
import java.util.List;

public class VendorMachine {
    List<String> ls = new ArrayList<>();
    public VendorMachine() {
        ls.add(String.valueOf(new Aqua(1,"Bonaqua",5,"0,5")));
        ls.add(String.valueOf(new Aqua(2,"Sprite",15,"1")));
        ls.add(String.valueOf(new Snacks(3, "Pistatio", 3, "200 gr")));
    }

    public List<String> getLs() {
        return ls;
    }

    @Override
    public String toString() {
        return "Assortment - " + ls;
    }
}