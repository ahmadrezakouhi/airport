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
public class Plane {

    private int serial;
    private int capacity;
    private Date dateOfProduct;
    private ArrayList<Flight> flights;

    public Plane(int serial, int capacity, Date dateOfProduct) {
        this.serial = serial;
        this.capacity = capacity;
        this.dateOfProduct = dateOfProduct;
        this.flights = new ArrayList<Flight>();
    }

    public int getSerial() {
        return serial;
    }

    public int getCapacity() {
        return capacity;
    }

    public Date getDateOfProduct() {
        return dateOfProduct;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDateOfProduct(Date dateOfProduct) {
        this.dateOfProduct = dateOfProduct;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

}
