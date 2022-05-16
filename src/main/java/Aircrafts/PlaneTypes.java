package Aircrafts;

public enum PlaneTypes {

    BOEING737("Boeing 737",158, 88.3),
    AIRBUSA350("Airbus 350",300, 280.65),
    CONCORT("Concort",3, 60.67);

    private final String type;
    private final int capacity;
    private final double weight;



    PlaneTypes(String type, int capacity, double weight ) {
        this.capacity = capacity;
        this.weight = weight;
        this.type = type;
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
