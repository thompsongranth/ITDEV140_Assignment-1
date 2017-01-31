/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thompson_myfirstjavaapp;

import java.util.Scanner;

/**
 *
 * @author Grant Thompson
 * ITDEV 140 THUR EVE
 * ASSIGNMENT 1
 */
public class Controller {
    Tip tip_1;
    String loopController = "y";

    public Controller() {
        
        Scanner s = new Scanner(System.in);
        do {
            tip_1 = new Tip();
            System.out.println("Would you like to try again? Y:N");
            System.out.print("> ");
            loopController= s.nextLine().toLowerCase();
        } while (loopController.equals("y"));
        
    }
    
   
    
    
}
