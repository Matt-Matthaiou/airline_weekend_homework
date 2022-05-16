import Personnel.CabinCrewMember;
import Personnel.CabinCrewRanks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {


    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Matt", CabinCrewRanks.FLIGHTATTENDANT);
    }

    @Test
    public void hasARank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void hasName(){
        assertEquals("Matt", cabinCrewMember.getName());
    }
}
