/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author Mariana
 */
public class TimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        double seconds = 1540800; 
        double minutes = seconds / 60; 
        double hours = minutes/60;//divided the received minites from the upper row
=======
        double seconds = 1540800; //initial seconds 
        double minutes = seconds / 60; // we need to divede the second by 60 to receive the needed minutes
        double hours = minutes/60;//we need to divide the minutes by 60 to receive the hours
>>>>>>> 7a1da4bb4f62d6020604e858b35f9423c75dbe9d
        double days = hours/24; 
        double weeks = days/7;
        double years = days/365;
        
		//We need to print the results receved in the variables

        System.out.println("Minutes:" + minutes);
        System.out.println("Hours:" + hours);
        System.out.println("Days:" + days);
        System.out.println("Weeks:" + weeks);
        System.out.println("Years:" + years);
        
        
    }
    
}
