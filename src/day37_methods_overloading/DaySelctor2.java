package day37_methods_overloading;

public class DaySelctor2 {
    public static void main(String[] args) {

    }
        public static String getDayName(int day) {
            switch(day) {
                case 1:
                    return "Monday"; //exit method
                //break; //unreachable code, because return already exits the method
                case 2: return "Tuesday";
                case 3: return "Wednesday";
                case 4: return "Thursday";
                case 5: return "Friday";
                case 6: return "Saturday";
                case 7: return "Sunday";
                default:
                    System.out.println("ERROR: Invalid day - " +  day);
                    return null;//nothing, no object
            }

        }
    }


