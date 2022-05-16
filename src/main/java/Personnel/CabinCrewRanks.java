package Personnel;

public enum CabinCrewRanks {
    FLIGHTATTENDANT("Flight Attendant"),
    CHIEFPURSER("Chief Purser");

    private final String rank;

    CabinCrewRanks(String rank) {
        this.rank = rank;
    }

    public String getValue(){
        return this.rank;
    }
}
