package com.example.ifbproject.Utils;

import java.util.ArrayList;

/**
 * Kalob Reinholz
 *
 * Last edited: 6/13/2022
 *
 * ArrayList of the users that is used to load username choiceBoxes
 */

public class UserNames {
    
    public static ArrayList<String> loadUserNames(){
        ArrayList<String> userNames = new ArrayList<>();
    
        userNames.add("John");
        userNames.add("Ava");
        userNames.add("Carl");
        userNames.add("Sophia");
        userNames.add("Manager");
        
        return userNames;
    }
}