
public class numConversion {
    public static void main(String[] args) {
        // System.out.print(intbin1(49));
        binint1(1000);
    }
// int as binary and storing as int
    static int intbin1(int A){
        int bin =0;
        int pw = 1;
        while(A != 0){
            bin += pw*(A%2);
            A /= 2;
            pw *= 10;
        }
        return bin;
    }
// binary to int and storing as int
    static void binint1(int bin){
        int num = 0;
        int digit = 0;
        int i = 0;
        while( bin!=0){
            digit = bin%10;
            num += digit*Math.pow(2,i);
            i++; 
            bin /= 10;
        // System.out.println(digit);
        }
        System.out.print(num);
    }
}