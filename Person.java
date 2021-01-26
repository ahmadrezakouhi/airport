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
public class Person {

    private String name;
    private String lastName;
    private Date birthday;
    private int ID;

    public Person(String name, String lastName, Date birthday, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "name=" + name + ", lastName=" + lastName + ", birthday=" + birthday + ", ID=" + ID;
    }

}
