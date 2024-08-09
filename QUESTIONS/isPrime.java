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

// ! without using the function 

// int num = scnr.nextInt();

// boolean isPrime = true ;


// if(num <= 1 ){
//  isPrime = false;
// }

// for ( int i = 2 ; i <=  Math.sqrt(num) ; i++){

// if(num % i == 0){
//     isPrime = false ;
//     break;
// }


// }


// if(isPrime){
//     System.out.println("the number is prime number");
// } else {
//     System.out.println("the number is not  prime number");

// }


