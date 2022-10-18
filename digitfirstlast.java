import java.util.*;
// import java.lang.*;
public class digitfirstlast {
     
     public static void main(String argc[]){
          try (Scanner scan = new Scanner(System.in)) {
               int T = scan.nextInt();
               for(int i = 1;i<=T;i++){
                    int n = scan.nextInt();
                    // System.out.println("First Digit is " + firstDigit(n) + " and " + "Last Digit is "+ lastDigit(n));
                    sumdigits(n);
               }
          }
     }

     static int firstDigit(int n){
          while (n >= 10) 
               n /= 10;
               return n;
     }

     static int lastDigit(int n){
          return (n % 10);
     }

// sum of the digits 
     static void sumdigits(int n){
          int sum = 0;
          while (n>0) {
               int digit = n%10;
               sum = sum + digit;
               n = n/10;
          }
          System.out.println(sum);
     }

}