/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;

public class EnumSecondExample {
    // Enum within a class
    enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    
    public static void main(String[] args) {
        // Loop through an enum
        for (Months month: Months.values()) {
            printCommentOnMonth(month);
        }
    }

    public static void printCommentOnMonth(Months thisMonth) {     
        // Enums are commonly used in switch statements
        switch(thisMonth) {
            case JANUARY:
                System.out.println(thisMonth + ": Start of the year.");
                break;
            case FEBRUARY:
                System.out.println(thisMonth + ": It is cold in Calgary.");
                break;
            case MARCH: 
                System.out.println(thisMonth + ": Winter semester is almost done.");
                break;
            case APRIL:
                System.out.println(thisMonth + ": Could it be spring?");
                break;
            case MAY:
                System.out.println(thisMonth + ": Could it be spring?");
                break;
            case JUNE:
                System.out.println(thisMonth + ": Could it really be spring now?");
                break;
            case JULY:
                System.out.println(thisMonth + ": Summer! Time for cycling and kayaking.");
                break;
            case AUGUST:
                System.out.println(thisMonth + ": Scenic in the mountains.");
                break;
            case SEPTEMBER:
                System.out.println(thisMonth + ": Getting a bit colder.");
                break;
            case OCTOBER:
                System.out.println(thisMonth + ": Calgary is getting some snow...");
                break;
            case NOVEMBER:
                System.out.println(thisMonth + ": Is it ski season yet?");
                break;
            case DECEMBER:
                System.out.println(thisMonth + ": End of the year and almost time for winter semester.");
                break;
        }

    } // end of the printCommentOnMonth method

}
