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
public class Tip {
    
    private String restrauntName="";
    private double mealCost=0.0;
    private double tipPercentage = 0.0;
    
    public double getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public double getTipAmount() {
        return mealCost*tipPercentage;
    }

    public String getRestrauntName() {
        return restrauntName;
    }

    public void setRestrauntName(String restrauntName) {
        this.restrauntName = restrauntName;
    }

    public double getMealCost() {
        return mealCost;
    }

    public void setMealCost(double mealCost) {
        this.mealCost = mealCost;
    }

    public double getTotal() {
        return mealCost+(mealCost*tipPercentage);
    }

    //Constructor
    public Tip() {
        Begin();
        Display();
    }

    
    private void Begin() {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter the restraunt name.");
        System.out.print("> ");
        setRestrauntName(s.nextLine());
        System.out.println("Please enter your meal amount.");
        System.out.print("> ");
        setMealCost(s.nextDouble());
        System.out.println("Please enter the tip %");
        System.out.print("> ");
        setTipPercentage((s.nextDouble()/100));
        
        
    }

    private void Display() {
        System.out.println(String.format("Restraunt name:\t%1s", getRestrauntName()));
        System.out.println(String.format("Your Tip Amount @ %1$.0f%% = %2$.2f", (getTipPercentage()*100), getTipAmount()));
        System.out.println(String.format("Your meal Total with tip = %1$.2f", getTotal()));
    }
    
   
    
    
}
