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
public class FlightEmployee extends Person {

    private int personnelCode;
    private Date dateOfEmployeement;

    public FlightEmployee(String name, String lastName, Date birthday,
            int ID, int personnelCode, Date dateOfEmployeement) {
        super(name, lastName, birthday, ID);
        this.personnelCode = personnelCode;
        this.dateOfEmployeement = dateOfEmployeement;

    }

    public int getPersonnelCode() {
        return personnelCode;
    }

    public Date getDateOfEmployeement() {
        return dateOfEmployeement;
    }

    public void setPersonnelCode(int personnelCode) {
        this.personnelCode = personnelCode;
    }

    public void setDateOfEmployeement(Date dateOfEmployeement) {
        this.dateOfEmployeement = dateOfEmployeement;
    }

    @Override
    public String toString() {
        return super.toString() + "personnelCode=" + personnelCode + ", dateOfEmployeement=" + dateOfEmployeement;
    }

}
