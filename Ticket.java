/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

/**
 *
 * @author homa
 */
public class Ticket {

    private Flight flight;
    private Passenger passenger;
    private double price;

    public Ticket(Flight flight, Passenger passenger, double price) {
        this.flight = flight;
        this.passenger = passenger;

        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public double getPrice() {
        return price;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Plane getPlane() {
        return this.flight.getPlane();
    }

}
