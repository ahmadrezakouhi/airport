/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.Scanner;

/**
 *
 * @author homa
 */
public class Airport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Management management = new Management();

        Scanner input = new Scanner(System.in);
        int i;
        do {
            System.out.println("enter one of numbers for action : ");
            System.out.println("1 create flight employee");
            System.out.println("2 display flight employee");
            System.out.println("0 exit");
            i = input.nextInt();
            switch (i) {
                case 1:
                    management.createFlightEmployee();
                    break;
                case 2:
                    management.displayFlightEmployees();
                    break;

            }
        } while (i != 0);
    }

}
