import java.util.*;
public class findgcdlcm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            // System.out.println(hcf(a, b));
             forgcd(a, b);
            // System.out.println(whilegcd(a, b));
            // System.out.print(findGCD(a, b)); 
            // lcm(a, b);
            // System.out.println(modulogcd(a, b));

        } 
    }
// modulus recursion
    static int modulogcd(int a, int b){
        if (a==0) 
            return b; 
        return modulogcd(b%a, a);
    }

// euclid algorithm
    static int findGCD(int a, int b){  
        int r=0, x, y;  
        x = (a > b) ? a : b; // a is greater number  
        y = (a < b) ? a : b; // b is smaller number  
        r = b;  
        while(x % y != 0)  
            r = x % y;  
            x = y;  
            y = r;  
        return r;  
    }  

// While Loop method
    static int whilegcd(int a,int b){
        if (a == 0 && b == 0)
            return 0;
        if (a == 0)
             return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        else
        while (a!=b) {
            if (a>b) 
                a=a-b;
            else
                b=b-a;
        }
         return b;
    }

// recursive method 
    static int  hcf(int a,int b){   
        if (a == 0 && b == 0){
            return 0;
        }
        if (a == 0){
             return b;
        }
        if (b == 0){
            return a;
        }
        if (a == b){
            return a;
        }
        if (a > b){
            return hcf(a - b, b);
        }
            return hcf(a, b - a);
    }

// for loop method 
    static void forgcd(int a,int b){
        int gcd = 1; 
        if (a == 0 && b == 0)
            gcd=0;
        if (a == 0)
            gcd = b;
        if (b == 0)
            gcd = a;
        if (a == b)
            gcd = a;
        else
            for(int i = 1; i <= a && i <= b; i++) {  
                if(a%i==0 && b%i==0) {   
                    if(i>gcd){
                        gcd=i;
                    }
                }
            }  
        System.out.println(gcd); 
    }

// finding LCM
    static void lcm(int a,int  b) {
        int lcm = a > b ? a : b;    
        while(true) 
            if( lcm % a == 0 && lcm % b == 0 ) {
              System.out.print(lcm);
              break;
            }
            ++lcm;
    }
}

// lcm by gcd
