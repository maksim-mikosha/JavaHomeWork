package src;

public class Notebook {
    private String id;
    private String model;
    private String cpu;
    private String memory;
    private String ssd;
    private String color;

    public Notebook(String id, String model, String cpu, String memory, String ssd, String color) {
        this.id = id;
        this.model = model;
        this.cpu = cpu;
        this.memory = memory;
        this.ssd = ssd;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n Notebook id=" + id + ", " +
                "model:'" + model + "', " +
                "CPU:" + cpu + " core, " +
                "memory: " + memory + " GB, " +
                "SSD:" + ssd + " GB, " +
                "Color:" + color;
    }
}
