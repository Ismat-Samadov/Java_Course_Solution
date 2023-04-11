public class NumberOfDaysInMonth {
//    public static void main(String[] args) {
//        System.out.println(getDaysInMonth(2, 2023));
//        System.out.println(getDaysInMonth(2, 2024));
//        System.out.println(getDaysInMonth(2, 2020));
//
//    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    }
                } else {
                    isLeap = true;
                }
            } else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }

        return isLeap;
    }


    public static int getDaysInMonth(int month, int year) {
        int output = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            output = -1;
        } else if (isLeapYear(year) && month == 2) {
            output = 29;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    output = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    output = 30;
                    break;
                default:
                    output = 28;
                    break;
            }
            ;
        }
        return output;
    }
}


