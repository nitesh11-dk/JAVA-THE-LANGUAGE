import java.util.*;

public class isPrime {

    public static void main(String args[]) {
        // Write a program to check if a number is prime or not

        boolean res = isPrime();

        if (res) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

    public static boolean isPrime() {
        Scanner scnr = new Scanner(System.in);

        int num = scnr.nextInt();

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}