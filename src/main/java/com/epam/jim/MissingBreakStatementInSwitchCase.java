package com.epam.jim;

public class MissingBreakStatementInSwitchCase {
    public String getDayName(int dayOfWeek) {
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            default:
                dayName = "Invalid day";
        }
        return dayName;
    }
}