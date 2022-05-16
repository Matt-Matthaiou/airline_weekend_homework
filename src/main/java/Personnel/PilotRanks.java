package Personnel;

public enum PilotRanks {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer");

    private final String rank;


    PilotRanks(String rank) {
        this.rank = rank;
    }

    public String getValue(){
        return this.rank;
    }
}
