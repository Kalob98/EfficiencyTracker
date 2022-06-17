package com.example.ifbproject.Utils;

/**
 * Kalob Reinholz
 *
 * Last edited: 6/16/2022
 *
 * Enum class for the days of the week
 */

public enum DaysOfTheWeek {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4);
    
    int day;
    DaysOfTheWeek(int x) {
        day = x;
    }
    public int getDay() {
        return day;
    }
}