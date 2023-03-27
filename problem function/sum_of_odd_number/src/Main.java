import java.util.Scanner;

public class Main {
    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2*i - 1; // compute the ith odd number
            sum += oddNumber; // add the ith odd number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The sum of the first " + n + " odd numbers is: " + sumOfOdd(n));
        sc.close(); // close the scanner to prevent resource leaks
    }
}
