import java.util.*;
// import java.lang.*;
public class Number {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
                // for (int i = 1; i <=N; i++) {
                //     if (i == arm(i)) {
                //         System.out.println(i);
                //     }       
                // }
            prime(N);
        }
    }
    public static int arm(int n){
        int cube = 0;
        while(n!=0){
            int digit =n %10;
            // math approch
            cube= cube + (int)Math.pow(digit,3);
            // for loop approch
            int mul = 1;
            int ans = 0;
            for (int i = 1; i <=3 ; i++) {
                 mul = mul * digit;
            }
            ans = ans + mul;
            n=n/10;
        }
        return cube;
    }  
    public static void prime(int n){
        for (int i = 2; i <=n ; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) 
               if (i%j==0) 
                count = count+1;
            if (count==2) 
                System.out.println(i);
        }
    }
}
