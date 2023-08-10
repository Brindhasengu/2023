package org.example;

public class SwitchCase {
    public static void main(String[] args) {
        int day= 3 ;
        String dayString;
        //Sitch St
        switch (day) {
            //case
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString ="Thursday";
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString ="Sunday";
            //Default case
            default:
              dayString = "invalid day";
        }
        System.out.println(dayString);
        }
    }


