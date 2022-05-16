package Aircrafts;

public class Plane {

    private String type;
    private int capacity;
    private double weight;

    public Plane(PlaneTypes type){
        this.type = type.getType();
        this.capacity = type.getCapacity();
        this.weight = type.getWeight();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
