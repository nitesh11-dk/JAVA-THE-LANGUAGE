import java.util.*;



public class start {

    public static void main(String args[]){

   // ! Write a program to check if a number is prime or not-

  boolean res = isPrime();

  if(res){
    System.out.println("this is a prime number");
  } else {
    System.out.println("this is  not a prime number");
    
  }



    }




public static boolean isPrime(){
        Scanner scnr = new Scanner(System.in);

int num = scnr.nextInt();



if(num <=1){
    return false ;
} 



for(int i = 2 ; i <= Math.sqrt(num); i++ ){

    if(num % i ==0){
        return false ; 
    }

}



return true ;




}



 

}



// Write a program to find the factorial of a number.
// Write a program to check if a number is Armstrong number or not.
// Write a program to reverse a number,
// Write a program to find the GCD and LCM of three numbers.
// Write a program to find the smallest and largest among 3 numbers.
// Write a program to print array in reverse order.
// Write J program to find smallest and largest element in array.



