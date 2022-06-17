package com.example.ifbproject.Utils;

import com.example.ifbproject.Controllers.CounterPageController;

import java.util.ArrayList;

/**
 * Kalob Reinholz
 *
 * Last edited: 6/14/2022
 *
 * This class is populating John's production ArrayList with random numbers that represent the amount of items he made
 * each day of the month, except last day because the counter is counting the last day's amount.
 *
 * Each month will have 4weeks consisting of 5 days.
 */

public class MonthlyQuota {
    private static ArrayList<String> names = UserNames.loadUserNames();
    
    //generating random data for everyday of the month except the last day
    public static void fillArray(){
        for (int i = 0; i < names.size() - 1; i++) {
            ArrayList<ArrayList<Integer>> monthlyProductivity = new ArrayList<>();
        
            monthlyProductivity.add(new ArrayList<>()); //week 1
            monthlyProductivity.add(new ArrayList<>()); //week 2
            monthlyProductivity.add(new ArrayList<>()); //week 3
            monthlyProductivity.add(new ArrayList<>()); //week 4
        
            //Hardcoded random values
            monthlyProductivity.get(0).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 1 day 1
            monthlyProductivity.get(0).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 1 day 2
            monthlyProductivity.get(0).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 1 day 3
            monthlyProductivity.get(0).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 1 day 4
            monthlyProductivity.get(0).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 1 day 5
        
            monthlyProductivity.get(1).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 2 day 1
            monthlyProductivity.get(1).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 2 day 2
            monthlyProductivity.get(1).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 2 day 3
            monthlyProductivity.get(1).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 2 day 4
            monthlyProductivity.get(1).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 2 day 5
        
            monthlyProductivity.get(2).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 3 day 1
            monthlyProductivity.get(2).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 3 day 2
            monthlyProductivity.get(2).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 3 day 3
            monthlyProductivity.get(2).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 3 day 4
            monthlyProductivity.get(2).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 3 day 5
        
            monthlyProductivity.get(3).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 4 day 1
            monthlyProductivity.get(3).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 4 day 2
            monthlyProductivity.get(3).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 4 day 3
            monthlyProductivity.get(3).add((int) (Math.random() * ((600 - 300) + 1)) + 300); //week 4 day 4
            monthlyProductivity.get(3).add(0); //week 4 day 5 (current day)
        
            //adding users to the map
            CounterPageController.getMap().put(names.get(i), monthlyProductivity);
        }
    }
}