import java.util.Scanner;



public class Fibonacci {


    public static void main (String[] args) {
        // creation of a scanner that takes system input, in this case, the nth fibonacci times.
        Scanner getInput = new Scanner(System.in);
        // Prints out to have user input
        System.out.println("Enter a number for the fibonacci sequence: ");
        // creation of int maxNum, that is the max times the fibonacci sequence executes for, inserted by the user.
        int maxNum = getInput.nextInt();
        // Inserts the user input into the method that uses a for loop to calculate the fibonacci sequence.
        System.out.println(fiboSeriesIte(maxNum));
        System.out.println("-----------------------------");
        System.out.println(fiboSeriesRec(maxNum));
    }

    public static int fiboSeriesRec(int num) {
        int prevNum = 0;
        int nextNum = 1;
        int sum;
        if (num == 0) {
            // Spits back an error for zero input
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            System.out.println(prevNum);
            sum = prevNum + nextNum;
            prevNum = nextNum;
            prevNum = sum;
            return fiboSeriesIte(num);
        }
}

    // The Interation method that uses a for loop to calculate the fibonacci numbers up to a user input nth times.
    static int fiboSeriesIte(int n){
        // Declaration of integers for the different ints used to calculate the fibonacci series, oldNum is the first number in this case 0, and 1 is the second.
        int oldNum = 0;
        int newNum = 1;
        int result;
        // if statement, depending on user input to calculate fibonacci
        if (n==0){
            // Spits back an error for zero input
            System.out.println("***ERROR***: Zero input gives you nothing!");
        } else if (n==1){
            // Prints the fibonacci sequence for the input 1.
            System.out.println("\n[Fibonacci sequence for n = "+ n +"]");
            return 0;
        } else{
            // Prints a header for the fibonacci sequence for what the user inputs.
            System.out.println("\n[Fibonacci sequence for n = "+ n +"]");

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
