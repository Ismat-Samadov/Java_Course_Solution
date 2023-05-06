import java.util.Scanner;


//Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//
//        The method should not return anything (void) and it needs to keep reading int numbers
//        from the keyboard.
//
//        When the user enters something that is not an int then it needs to print a message
//        in the format "SUM = XX AVG = YY".
//
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.
//
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        EXAMPLE 1:
//
//        INPUT:
//
//        1
//        2
//        3
//        4
//        5
//        a
//        OUTPUT
//
//        SUM = 15 AVG = 3
//
//
//
//        EXAMPLE 2:
//
//        INPUT:
//
//        hello
//
//        OUTPUT:
//
//        SUM = 0 AVG = 0
//
//
//
//        TIP: Use Scanner to read an input from the user.
//
//        TIP: Use casting when calling the round method since it needs double as a parameter.
//
//        NOTE: Use the method Math.round to round the calculated average (double). The method
//        round returns long.
//
//        NOTE: Be mindful of spaces in the printed message.
//
//        NOTE: Be mindful of users who may type an invalid input right away (see example above).
//
//        NOTE: The method inputThenPrintSumAndAverage should be defined as public static like
//        we have been doing so far in the course.
//
//        NOTE: Do not add the main method to the solution code.


import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }
        scanner.nextLine(); // consume the remaining newline character
        long average = count == 0 ? 0 : Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

//
//Here's how the method works:
//
//        The method creates a new instance of the Scanner class to read input from the keyboard.
//        It initializes two variables, sum and count, to zero. sum will hold the sum of
//        all entered numbers, and count will hold the number of entered numbers.
//        The method enters a loop that reads integers from the input using the hasNextInt
//        method of the Scanner class. If it is, the number is added to the sum variable and
//        the count variable is incremented.
//        If the input is not an integer, the loop is exited.
//        The average is calculated by dividing the sum by the count, and rounding the result to
//        the nearest integer using the Math.round method. If no integers were entered,
//        the average is set to 0.
//        The sum and average are printed to the console using the System.out.println method.
//        The Scanner object is closed to release resources.
//        Note that in order to prevent input errors, we use the scanner.nextLine() method
//        to consume the newline character left in the input buffer after reading an integer.
//
//        This implementation will handle any number of input integers, and will calculate
//        the sum and average correctly. If the user enters something that is not an integer,
//        the loop will exit and the sum and average will be printed to the console
//        with a value of 0 for both if no integers were entered.