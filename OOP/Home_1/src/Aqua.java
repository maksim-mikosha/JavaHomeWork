public class Aqua extends Product {
    private String volume;

    public Aqua(Integer id, String name, Integer cost, String volume) {
        super(id, name, cost);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Water - " + getName() + "(" + volume + ")";
    }
}
