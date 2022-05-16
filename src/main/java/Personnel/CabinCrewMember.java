package Personnel;

public class CabinCrewMember extends Aircrew{

    private String name;
    private CabinCrewRanks rank;

    public CabinCrewMember(String name, CabinCrewRanks rank){
        super(name, rank.getValue());
    }

    public String relayMessage(String message){
        return message;
    }
}
