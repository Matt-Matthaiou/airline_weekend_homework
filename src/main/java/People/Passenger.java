package People;

public class Passenger {

    private String name;
    private int bags;

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
    }
}
