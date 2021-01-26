/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author homa
 */
public class Pilot extends FlightEmployee {

    ArrayList<Flight> flights;

    public Pilot(
            String name, String lastName,
            Date birthday, int ID, int personnelCode, Date dateOfEmployeement) {
        super(name, lastName, birthday, ID, personnelCode, dateOfEmployeement);
        this.flights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

}
