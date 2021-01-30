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
    private Time time;
    private Pilot pilot;
    private ArrayList<FlightAttendant> flightattendants;
    private ArrayList<Passenger> passengers;
    private ArrayList<Ticket> tickets;

    public Flight(int serial, Plane plane, String origin, String destination, Date date, Time time, Pilot pilot) {
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

    public Time getTime() {
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

    public ArrayList<Ticket> getTickets() {
        return tickets;
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

    public void setTime(Time time) {
        this.time = time;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setFlightattendants(ArrayList<FlightAttendant> flightattendants) {
        this.flightattendants = flightattendants;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

}
