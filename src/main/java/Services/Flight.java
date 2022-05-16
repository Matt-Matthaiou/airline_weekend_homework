package Services;

import Aircrafts.Plane;
import People.Passenger;
import Personnel.CabinCrewMember;
import Personnel.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Pilot coPilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengerList;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;
    private Plane plane;



    public Flight(Pilot pilot, Pilot coPilot, ArrayList<CabinCrewMember> cabinCrew, String flightNumber, String destination, String departure, String departureTime, Plane plane) {
        this.pilot = pilot;
        this.coPilot = coPilot;
        this.cabinCrew = cabinCrew;
        this.passengerList = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int numberOfAvailableSeats(){
        return this.plane.getCapacity() - passengerList.size();
    }

    public int passengerListVolume(){
        return passengerList.size();
    }

    public Plane getPlane(){
        return this.plane;
    }

    public String bookPassenger(Passenger passenger){
        if (passengerList.size() < this.plane.getCapacity()){
            passengerList.add(passenger);
            return "Passenger booked";
        }
        else{
            return "No available seats";
        }
    }
}
