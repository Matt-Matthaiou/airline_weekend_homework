import Personnel.Pilot;
import Personnel.PilotRanks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Matt", PilotRanks.CAPTAIN, "AA3454Z");
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasName(){
        assertEquals("Matt", pilot.getName());
    }

    @Test
    public void hasLicence(){
        assertEquals("AA3454Z", pilot.getPilotLicence());
    }
}
