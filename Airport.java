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
            System.out.println("1 manage flight employees");
            System.out.println("2 manage planes");
            System.out.println("3 manage passengers");
            System.out.println("4 manage tickets");
            System.out.println("5 manage flights");
            System.out.println("0 exit");
            i = input.nextInt();
            switch (i) {
                case 1:
                    int x = 0;
                    do {
                        System.out.println("###############     manage flight employees     #############");
                        System.out.println("enter one of numbers for action :");
                        System.out.println("1 add flight employee");
                        System.out.println("2 edit flight employee");
                        System.out.println("3 delete flight employee");
                        System.out.println("4 display information of flight employees ");
                        x = input.nextInt();
                        switch (x) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;

                        }
                    } while (x != 0);
                    break;
                case 2:
                    int y = 0;
                    do {
                        System.out.println("###############     manage Planes     #############");
                        System.out.println("enter one of numbers for action :");
                        System.out.println("1 add flight employee");
                        System.out.println("2 edit flight employee");
                        System.out.println("3 delete flight employee");
                        System.out.println("4 display information of flight employees ");
                        y = input.nextInt();
                        switch (y) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;

                        }
                    } while (y != 0);
                    break;
                case 3:
                    int z = 0;
                    do {
                        System.out.println("###############     manage passengers     #############");
                        System.out.println("enter one of numbers for action :");
                        System.out.println("1 add passenger");
                        System.out.println("2 edit passenger");
                        System.out.println("3 delete passenger");
                        System.out.println("4 display information of passenger ");
                        z = input.nextInt();
                        switch (z) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;

                        }
                    } while (z != 0);
                    break;
                case 4:
                    int n = 0;
                    do {
                        System.out.println("###############     manage tickets     #############");
                        System.out.println("enter one of numbers for action :");
                        System.out.println("1 create ticket");
                        System.out.println("2 edit ticket");
                        System.out.println("3 delete ticket");
                        System.out.println("4 display information of ticket ");
                        n = input.nextInt();
                        switch (n) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;

                        }
                    } while (n != 0);
                    break;
                case 5:
                    int m = 0;
                    do {
                        System.out.println("###############     manage flights     #############");
                        System.out.println("enter one of numbers for action :");
                        System.out.println("1 create flight");
                        System.out.println("2 edit flight");
                        System.out.println("3 delete flight");
                        System.out.println("4 display information of flight ");
                        m = input.nextInt();
                        switch (m) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;

                        }
                    } while (m != 0);
                    break;

            }
        } while (i != 0);
    }

}
