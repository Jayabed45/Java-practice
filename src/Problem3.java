//Problem 3 - Addition

//Task

//Create two integer variables.

//Example:

//10
//20

//Print their sum.

//Expected Output

//First Number: 10
//Second Number: 20
//Sum: 30

public class Problem3 {
    public static void main(String[] args) {

        String firstNumber = "10";
        String secondNumber = "20";
        int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Sum: " + sum);
    }
}
