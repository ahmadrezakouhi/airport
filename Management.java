/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author homa
 */
public class Management {
    
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<FlightEmployee> flightEmployee = new ArrayList<FlightEmployee>();
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    private Scanner input = new Scanner(System.in);
    
    public void createFlightEmployee() {
        
        System.out.println("for create pilot press (1) or for create flightattendant press (2)");
        FlightEmployee flightEmployee = null;
        int i = input.nextInt();
        System.out.println("enter name : ");
        String name = input.next();
        System.out.println("enter lastName :");
        String lastName = input.next();
        System.out.println("enter birthday : ");
        Date birthday = new Date();
        System.out.println("enter Id :");
        int id = input.nextInt();
        System.out.println("enter personnal id :");
        int personalId = input.nextInt();
        System.out.println("enter date of employeement :");
        Date dateOfEmplyeement = new Date();
        switch (i) {
            case 1:
                
                flightEmployee = new Pilot(name, lastName, birthday, id, personalId, dateOfEmplyeement);
                break;
            case 2:
                flightEmployee = new FlightAttendant(name, lastName, birthday, id, personalId, dateOfEmplyeement);
                break;
            default:
                System.out.println("wrong !!!! enter 1 for pilot and 2 for flightattendant ");
        }
        
        if (flightEmployee != null) {
            this.flightEmployee.add(flightEmployee);
        }
        
    }
    
    public void displayFlightEmployees() {
        
        for (FlightEmployee flightEmployee : this.flightEmployee) {
            
            if (flightEmployee instanceof Pilot) {
                System.out.println("pilot");
            } else {
                System.out.println("flightAttendant");
            }
            
        }
        
    }
    
    public FlightEmployee findFlightEmployees(int id) {
        FlightEmployee employee = null;
        for (FlightEmployee flightEmployee : this.flightEmployee) {
            if (flightEmployee.getID() == id) {
                employee = flightEmployee;
            }
        }
        return employee;
    }
    
    public void displayFlightEmployee(int id) {
        
        FlightEmployee flightEmployee = findFlightEmployees(id);
        if (flightEmployee != null) {
            flightEmployee.toString();
        }
        
    }
    
    public void editFlightEmployee(int id) {
        FlightEmployee flightEmployee = findFlightEmployees(id);
        if (flightEmployee != null) {
            System.out.println("enter name ");
            String name = input.next();
            flightEmployee.setName(name);
            System.out.println("enter lastName : ");
            String lastName = input.next();
            flightEmployee.setLastName(lastName);
            System.out.println("enter birthday : ");
            Date birthday = new Date(); //will be changed 
            flightEmployee.setBirthday(birthday);
            System.out.println("enter id : ");
            int id1 = input.nextInt();
            flightEmployee.setID(id1);
            System.out.println("enter personnel id : ");
            int personnelId = input.nextInt();
            flightEmployee.setPersonnelCode(personnelId);
            System.out.println("enter date of employeement :");
            Date dateOfEmployeement = new Date();
            flightEmployee.setDateOfEmployeement(dateOfEmployeement);
        } else {
            System.out.println("there isn't employee with this id !!!!");
        }
        
    }
    
    public void deleteFlightEmployee(int id) {
        
        FlightEmployee flightEmployee = findFlightEmployees(id);
        if (flightEmployee != null) {
            this.flightEmployee.remove(flightEmployee);
        }
        
    }
    
    public Plane findPlane(int serial) {
        for (Plane plane : planes) {
            if (plane.getSerial() == serial) {
                return plane;
            }
        }
        return null;
    }
    
    public void createPlane() {
        System.out.println("enter serial :");
        int serial = input.nextInt();
        System.out.println("enter capacity :");
        int capacity = input.nextInt();
        System.out.println("enter Date");
        Date dateOfProduct = new Date();
        this.planes.add(new Plane(serial, capacity, dateOfProduct));
    }
    
    public void deletePlane(int serial) {
        Plane plane = findPlane(serial);
        if (plane == null) {
            System.out.println("there is not such plane in program!!!1");
        } else {
            
            for (Flight flight : plane.getFlights()) {
                if (flight.getPlane().getSerial() == serial) {
                    flight.setPlane(null);
                }
            }
            
            this.planes.remove(plane);
        }
        
    }
    
    public void editPlane(int serial) {
        Plane plane = findPlane(serial);
        if (plane == null) {
            System.out.println("there is not such plae in program !!!");
        } else {
            System.out.println("enter serial :");
            int serial1 = input.nextInt();
            plane.setSerial(serial1);
            System.out.println("enter capacity :");
            int capacity = input.nextInt();
            plane.setCapacity(capacity);
            System.out.println("enter date of product : ");
            Date date = new Date();
            plane.setDateOfProduct(date);
            
        }
    }
    
    public void addFlightToPlane(int serialPlane, int serialFlight) {
        Plane plane = findPlane(serialPlane);
        Flight flight = findFlight(serialFlight);
        if (plane != null && flight != null) {
            plane.getFlights().add(flight);
        }
        
    }
    
    public Flight findFlight(int serial) {
        
        for (Flight flight : this.flights) {
            if (flight.getSerial() == serial) {
                return flight;
            }
        }
        
        return null;
        
    }
    
    public void createTicket() {
        System.out.println("enter flight serial :");
        int serialFlight = input.nextInt();
        
    }
    
    public Passenger findPassenger(int id) {
        for (Passenger passenger : passengers) {
            if (passenger.getID() == id) {
                return passenger;
            }
        }
        
        return null;
    }
    
    public void createPassenger() {
        System.out.println("enter name : ");
        String name = input.next();
        System.out.println("enter lastName :");
        String lastName = input.next();
        System.out.println("enter birthday :");
        Date date = new Date();
        System.out.println("enter id :");
        int id = input.nextInt();
        this.passengers.add(new Passenger(name, lastName, date, id, lastName));
    }
    
    public void deletePassenger(int id) {
        
        for (Passenger passenger : passengers) {
            
        }
        
    }
    
}
