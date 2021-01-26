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
public class Passenger extends Person {

    private String fatherName;

    public Passenger(String name, String lastName, Date birthday, int ID, String fatherName) {
        super(name, lastName, birthday, ID);
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

}
