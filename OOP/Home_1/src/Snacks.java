public class Snacks extends Product {
    private String wight;

    public Snacks(Integer id, String name, Integer cost, String wight) {
        super(id, name, cost);
        this.wight = wight;
    }

    public String getWight() {
        return wight;
    }

    public void setWight(String wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Snack - " + getName() + "(" + wight + ")" + " cost " + getCost();
    }
}
