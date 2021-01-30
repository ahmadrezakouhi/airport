/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author homa
 */
public class CustomDate {

    private Date date;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public CustomDate(String stringDate) {
        setDate(stringDate);
    }

    public void setDate(String stringDate) {
        try {
            this.date = simpleDateFormat.parse(stringDate);
        } catch (ParseException parseException) {
            System.out.println("parse exception in Date class ");
        }
    }

    public Date getDate() {
        return date;

    }

}
