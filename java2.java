// import java.util.* ;
import java.util.*;


public class java2 {
    public static void main (String args[]){



// ! For taking input 
// ! Scanner  , we take  input by using this object , which is imported from module 
Scanner scnr = new Scanner(System.in);


// String input = scnr.next();
// next method shrif stating ke lettes ko leta hai , like space ke bad ka kuch nahi leta hai 
// String input = scnr.nextLine();
 // this is nextLine is used to  include all with spacess and all so we use this 
//  and by deafult  next and nextLine method uses a data type of string 


// int input = scnr.nextInt() ;
// byte input = scnr.nextByte();
// float input = scnr.nextFloat();
// boolean input = scnr.nextBoolean(); //  can accept only capital and small word 'true' and 'false'



//  next
// nextLine
// nextlnt
// nextByte
// nextFloat
// nextDouble
// nextBoolean
// nextShort
// nextLong

// System.out.println( "input is " + input);
  

//  int a = scnr.nextInt();
// int b = scnr.nextInt();

        // System.out.println(a + b);





// ! Type conversion / Widening / Implict conversion 


//?  Type Conversion
//?  Conversion happens when:
//?  a. type compatible
//  yiska matlab hai ki app numbers wala data type ko hii convert kar sakte hai dusare me , like float to int or to long ...  , but you cannot do integer to boolean 

//?  b. destination type > source type
//  yiska matalb hai kii  app bade size wala datatype ko chote size wale datatype me nahi rakh sakte hai , but yiska yulta is possible 

int d= 23 ;
long c = d ;

//  here c is called as destiantion type and d is a source type 

//?  byte -> short -> int -> float -> long -> double

// lossy conversion  --- yaise converison jaha appka data loss ho sakta  hai jese ki  8 byte ka data app 2 byte me dal doge , then there is loss of data in that so this is called lossy converion , but java don't allow to do this . 


//  implict converion 
//  float num = scnr.nextInt(); // by deafult it convert nextInt() into float   , and this conversion is implict

//  System.out.println(num);


// ! Type Casting  // narrowing  conversion // explict converion


//   the type of conveesion that java don't allow but , we forcefully want to convert that and the is called as type casting 

// float marks =  99.99f; // yaha par f likhan jaruri hai qkii by deafult ye double hota hai keuu kii float hota hai 32bit (4byte) aur double hota hai  64-bit(8byte)
// int withourDeciMarks =  (int) marks ;
// System.out.print(withourDeciMarks) ;





//  ? charctes ko number me convert kiya ja sakta hai , lekin vo by deaflut diya gaya hai number like for 'a' it is 97 for 'b' it is  98 ... and for 'A' 65 ... 

char chr = 'B';
int number = chr ;
System.out.println(number) ;









    }
}