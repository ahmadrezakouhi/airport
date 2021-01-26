/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author homa
 */
public class Flight {

    private int serial;
    private Plane plane;
    private String origin;
    private String destination;
    private Date date;
    private TimeZone time;
    private Pilot pilot;
    private ArrayList<FlightAttendant> flightattendants;
    private ArrayList<Passenger> passengers;
    private ArrayList<Ticket> tickets;

    public Flight(int serial, Plane plane, String origin, String destination, Date date, TimeZone time, Pilot pilot) {
        this.serial = serial;
        this.plane = plane;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.pilot = pilot;
        this.flightattendants = new ArrayList<FlightAttendant>();
        this.passengers = new ArrayList<Passenger>();
    }

    public int getSerial() {
        return serial;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDate() {
        return date;
    }

    public TimeZone getTime() {
        return time;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<FlightAttendant> getFlightattendants() {
        return flightattendants;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(TimeZone time) {
        this.time = time;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void addFlightAttendant(FlightAttendant flightAttendant) {
        this.flightattendants.add(flightAttendant);
    }

    public void removeFlightAttendant(FlightAttendant flightAttendant) {

        this.flightattendants.remove(flightAttendant);
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

}
