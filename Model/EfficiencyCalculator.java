package com.example.ifbproject.Model;

import com.example.ifbproject.Controllers.CounterPageController;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Kalob Reinholz
 *
 * Last edited: 6/17/2022
 *
 * Class used to calculate the day, week, and month efficiency
 */

public class EfficiencyCalculator {
    //Formatter used to format the efficiency
    private static final NumberFormat FORMATTER = new DecimalFormat("#0.00");
    
    //daily quota used to determine efficiency
    private static final double QUOTA = 500.00;
    private static final int numberOfDaysInWeek = 5;
    private static final int numberOfDaysInMonth = 20;
    
    //calculating the users' day efficiency
    public static String dayEfficiencyCalculation(String name, int week, int day){
        //gets the total amount of items made for the day
        int dayTotal = (CounterPageController.getMap().get(name).get(week).get(day));
        
        //100.0 is used to get a percentage
        return FORMATTER.format((dayTotal / QUOTA) * 100.00) + "%";
    }
    
    //calculating the users' week efficiency based on the week provided
    public static String weekEfficiencyCalculation(String name, int weekNumberUsedForArrayList){
        int sum = 0;
        
        //loop used to add all the week's items made by the user
        ArrayList<Integer> weekArray = CounterPageController.getMap().get(name).get(weekNumberUsedForArrayList);
        for(int i = 0; i < weekArray.size(); i++){
            sum += weekArray.get(i);
        }
    
        //prints the total number made in the week
        System.out.println("Week: " + CounterPageController.getMap().get(name).get(weekNumberUsedForArrayList));
        
        //100.0 is used to get a percentage
        return FORMATTER.format(((sum / numberOfDaysInWeek) / QUOTA) * 100.0) + "%";
    }
    
    //calculating the users' month efficiency
    public static String monthEfficiencyCalculation(String name){
        int sum = 0;
        
        //loop used to add all the month's items made by the user
        ArrayList<ArrayList<Integer>> monthArray = CounterPageController.getMap().get(name);
        for(int i = 0; i < monthArray.size(); i++){
            for(int j = 0; j < monthArray.get(i).size(); j++){
                sum += monthArray.get(i).get(j);
            }
        }
    
        //100.0 is used to get a percentage
        return FORMATTER.format(((sum / numberOfDaysInMonth) / QUOTA) * 100.0) + "%";
    }
}