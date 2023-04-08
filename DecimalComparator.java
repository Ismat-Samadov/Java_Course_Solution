//DecimalComparator
//        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//        The method should return boolean and
//        it needs to return true if two double numbers are the same up to three decimal places.
//        Otherwise, return false.
//
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true
//        since numbers are equal up to 3 decimal places.
//
//        areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false
//        since numbers are not equal up to 3 decimal places
//
//        areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true
//        since numbers are equal up to 3 decimal places.
//
//        areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false
//        since numbers are not equal up to 3 decimal places.
//
//
//
//        TIP: Use paper and pencil.
//
//        TIP: Use casting.
//
//        NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.
//
//


public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        String doubleToString = Double.toString(first);
        String strArray[] = doubleToString.split("\\.");
        int integerPartOfNumber = Integer.parseInt(strArray[0]); // first part of first double
        int decimalPartOfNumber = Integer.parseInt(strArray[1]);
        String decimalDigits = Integer.toString(decimalPartOfNumber);
        int firstNumberOfDigits = Character.getNumericValue(decimalDigits.charAt(0));
        int secondNumberOfDigits = Character.getNumericValue(decimalDigits.charAt(1));
        int thirdNumberOfDigits = Character.getNumericValue(decimalDigits.charAt(2));


        String doubleToString_2 = Double.toString(second);
        String stringArray[] = doubleToString_2.split("\\.");
        int integerPartOfNumber_2 = Integer.parseInt(stringArray[0]); // first part of second double
        int decimalPartOfNumber_2 = Integer.parseInt(stringArray[1]);
        String decimalDigits_2 = Integer.toString(decimalPartOfNumber_2);
        int firstNumberOfDigits_2 = Character.getNumericValue(decimalDigits_2.charAt(0));
        int secondNumberOfDigits_2 = Character.getNumericValue(decimalDigits_2.charAt(1));
        int thirdNumberOfDigits_2 = Character.getNumericValue(decimalDigits_2.charAt(2));


        if (integerPartOfNumber == integerPartOfNumber_2 &&
                firstNumberOfDigits == firstNumberOfDigits_2 &&
                secondNumberOfDigits == secondNumberOfDigits_2 &&
                thirdNumberOfDigits == thirdNumberOfDigits_2
        ) {
            return true;
        } else {
            return false;
        }

    }
}
