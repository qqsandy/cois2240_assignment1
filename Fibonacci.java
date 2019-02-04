import java.util.Scanner;
import com.google.common.base.Stopwatch;

// Citation: Tutorial and usage of timing library "Guava - Stopwatch" https://google.github.io/guava/releases/18.0/api/docs/com/google/common/base/Stopwatch.html

public class Fibonacci {

    public static void main (String[] args) {

        // creation of a scanner that takes system input, in this case, the nth fibonacci times.
        Scanner getInput = new Scanner(System.in);

        // Prints out to have user input
        System.out.println("Enter a number for the fibonacci sequence: ");

        // creation of int maxNum, that is the max times the fibonacci sequence executes for, inserted by the user.
        int maxNum = getInput.nextInt();

        // Creation of stopwatch for iteration method
        Stopwatch stopwatchIte = Stopwatch.createStarted();

        // Inserts the user input into the method that uses a for loop to calculate the fibonacci sequence.
        System.out.println(fiboSeriesIte(maxNum));

        // Stops timer for Iteration method
        stopwatchIte.stop();

        // Declaration and creation of stopwatch timer starting.
        Stopwatch stopwatchRec = Stopwatch.createStarted();
        // Just a title for the recursive method output.
        System.out.println("\n[(Recursive) Fibonacci sequence for n = "+ maxNum +"]");

        // for loop that prints each number in the fibonacci series in the rec method up to user input 'maxNum'
        for (long i=0; i<maxNum; i++){
            System.out.println(fiboSeriesRec(i));
        }
        // Stops timer for recursion method
        stopwatchRec.stop();

        // Prints out the outcome of both method's time.
        System.out.println("\nIteration method toke: "+stopwatchIte);
        System.out.println("Recursion method toke: "+stopwatchRec);
    }

    public static long fiboSeriesRec(long n){

        // If statement for the recursion method, where it returns 0 and 1 respectfully depending on user input
        if(n ==0){
            return 0;
        } else if (n == 1){
            return 1;
        }
        else{
            // recalls itself but by using (n-1)+(n-2) formula emulates the fibonacci sequence.
            return fiboSeriesRec(n-1)+fiboSeriesRec(n-2);
        }
    }

    // The Iteration method that uses a for loop to calculate the fibonacci numbers up to a user input nth times.
    public static long fiboSeriesIte(long n){

        // Declaration of integers for the different ints used to calculate the fibonacci series, oldNum is the first number in this case 0, and 1 is the second.
        long oldNum = 0;
        long newNum = 1;
        long result;

        // if statement, depending on user input to calculate fibonacci
        if (n==0){
            // Spits back an error for zero input
            return 0;
        } else if (n==1){
            // Prints the fibonacci sequence for the input 1.
            System.out.println("\n[(Iterative) Fibonacci sequence for n = "+ n +"]");
            return 0;
        } else{
            // Prints a header for the fibonacci sequence for what the user inputs.
            System.out.println("\n[(Iterative) Fibonacci sequence for n = "+ n +"]");

            // For loop that calculates the next sum of the previous two sums, also known as the fibonacci series up to a user input 'n' times.
            for (int i=1; i< n; i++){
                // Prints the number of the sequence starting with '0'.
                System.out.println(oldNum);
                // Calculates with the previous number + the new number.
                result = oldNum + newNum;
                // Setting the new previous number to the new one to get the sum of the NEXT entry
                oldNum = newNum;
                // Now setting the new number equal to the sum of the last two to complete the sequence once.
                newNum = result;

            }
        }
        // Returns the very last variable. ( for some reason I couldn't not return a value and this seemed like the best way to get it to work.)
        return oldNum;
    }
}