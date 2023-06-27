/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.ensf409;



// Stand-alone enum 
enum DaysWeek {
    // We can include methods associated with each constant
    MONDAY {
        public String toString() { 
            return "Monday";
        }
    },
    TUESDAY {
        public String toString() {
            return "Tuesday";
        }
    },
    WEDNESDAY {
        public String toString() {
            return "Wednesday";
        }
    },
    THURSDAY {
        public String toString() {
            return "Thursday";
        }
    },
    FRIDAY {
        public String toString() {
            return "Friday";
        }
    },
    SATURDAY {
        public String toString() {
            return "Saturday";
        }
    },
    SUNDAY {
        public String toString() {
            return "Sunday";
        }
    };

    // Define an abstract method which each enum field must implement
    // This is not necessary in order to have methods associated with fields,
    // but ensures that every field must have the method.
    public abstract String toString();

    // We can include a method associated with the entire enum
    public static void introduction() {
        System.out.println("Method introduction called from DaysWeek");
    }

}

public class EnumThirdExample {
    
    public static void main(String[] args) {
        // Access a method from the enum
        DaysWeek.introduction();

        // Access a specific enum constant
        DaysWeek day = DaysWeek.SATURDAY;

        // Another way to access this method
        day.introduction();

        // Access position in the enumeration (starts from 0)
        int i = day.ordinal();
        System.out.println(day.toString() + " is at position " + i);
       
    }
}
