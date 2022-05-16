package Personnel;

public class Pilot extends Aircrew{

    private String name;
    private PilotRanks rank;
    private String pilotLicence;

    public Pilot(String name, PilotRanks rank, String pilotLicence){
        super(name, rank.getValue());
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String flyThePlane(){
        return "Prepare for takeoff";
    }
}
