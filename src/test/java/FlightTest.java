import Aircrafts.Plane;
import Aircrafts.PlaneTypes;
import People.Passenger;
import Personnel.CabinCrewMember;
import Personnel.CabinCrewRanks;
import Personnel.Pilot;
import Personnel.PilotRanks;
import Services.Flight;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Pilot pilot;
    private Pilot coPilot;
    private CabinCrewMember cabinCrewMember;
    private Plane plane;
    private ArrayList<CabinCrewMember> cabinCrewList;

    @Before
    public void before(){
        passenger = new Passenger("John", 1);
        pilot = new Pilot("Matt", PilotRanks.CAPTAIN, "ABC123");
        coPilot = new Pilot("Moumi", PilotRanks.FIRSTOFFICER, "CBA321");
        cabinCrewMember = new CabinCrewMember("Doulos", CabinCrewRanks.FLIGHTATTENDANT);
        plane = new Plane(PlaneTypes.CONCORT);
        cabinCrewList = new ArrayList<>();
        cabinCrewList.add(cabinCrewMember);
        cabinCrewList.add(cabinCrewMember);
        cabinCrewList.add(cabinCrewMember);
        flight = new Flight(pilot, coPilot,cabinCrewList,"FR666","ATH", "EDI","6:45",plane);

    }

    @Test
    public void hasPilot(){
        assertEquals("Matt", flight.getPilot().getName());
    }

    @Test
    public void hasCoPilot(){
        assertEquals("Moumi", flight.getCoPilot().getName());
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, flight.passengerListVolume());
    }

    @Test
    public void canBookAPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerListVolume());
    }

    @Test
    public void cannotBookMoreThanCapacity(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(3, flight.passengerListVolume());
    }

    @Test
    public void canReturnTheNumberOfAvailableSeats(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(1, flight.numberOfAvailableSeats());
    }
}
