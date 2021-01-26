/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.Date;

/**
 *
 * @author homa
 */
public class FlightAttendant extends FlightEmployee {

    public FlightAttendant(String name, String lastName, Date Birthday, int ID,
            int personnelCode, Date dateOfEmployeement) {
        super(name, lastName, Birthday, ID, personnelCode, dateOfEmployeement);
        
    }
}
