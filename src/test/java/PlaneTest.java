import Aircrafts.Plane;
import Aircrafts.PlaneTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneTypes.CONCORT);
    }

    @Test
    public void hasType(){
        assertEquals("Concort", plane.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(60.67, plane.getWeight(), 0.0);
    }
}
