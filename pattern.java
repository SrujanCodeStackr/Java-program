// Pattern Questions
// Print these patterns using loops:
class pattern {
    public static void main(String[] args) {
        pattern43(5);
    }  
    static void pattern1(int n){
        /* 1.   *****
                *****
                *****
                *****   */                              
        for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print( "*");
            }
            // when one row is printed need to add new line 
            System.out.println();
        }
    }
    static void pattern2(int n) {
        /*  2.  *
                **
                ***
                ****
                *****   */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        /*  3.  *****
                ****
                ***
                **
                *       */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col<=n-row+1)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
       /*   4.  1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5   */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col<row)
                System.out.print(col + " ");    
                else
                System.out.print(col);
            }
            // when one row is printed need to add new line 
            System.out.println();
        }
    }
    static void pattern5(int n){
        /*      5.  *
                    **
                    ***
                    ****
                    *****
                    ****
                    ***
                    **
                    *    */
        for (int row = 0; row < 2*n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // need to rectify
     static void pattern6(int n) {
        /*  6.       *
                    **
                   ***
                  ****
                 *****  */
        for (int row = 1; row <= 5; row++) {
            for (int space= 1; space<= n-row+1; space++) {
                System.out.print(" "); 
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void pattern7(int n){
        /* 7.   *****
                 ****
                  ***
                   **
                    *       */
        for(int row = 1;row<=n;row++){
            for(int col=1;col<=n;col++){  
               if(col<=row-1)
                System.out.print(" ");  
               else
                System.out.print("*");                 
            }
        System.out.println();
        } 
    }
    static void pattern8(int n){
        /* 8.    *
                ***
               *****
              *******
             *********       */
        for(int row = 1;row<=n;row++){
            int nstars = 2*row-1;
            int nspaces = n-row;
            for(int sp=1;sp<=nspaces;sp++){
                System.out.print(" ");
            }  
            for(int st=1;st<=nstars;st++){
                System.out.print("*");
            } 
            System.out.println();
        }
            
    }
    static void pattern9(int n){
            /*   9.  *********
                      *******
                       *****
                        ***
                         *      */

        for(int row=0;row<n;row++){
            int nspaces = row;
            int nstars = 2*(n-row)-1;
            for(int sp=1;sp<=nspaces;sp++){
                System.out.print(" ");
            }
            for(int st =1;st<=nstars;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int c= row > n ? 2 * n - row : row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--){
                System.out.print(col + " ");    
           }
           for (int col = 2; col <= c; col++){
                System.out.print(col + " ");
           }  
           System.out.println(" ");  
        }
    }
    static void pattern20(int n){
        /* 20.    ****
                  *  *
                  *  *
                  *  *
                  ****   */
        for(int row = 1;row<=n;row++){
            if(row==1||row==n){
                for(int col = 1;col<=n;col++){
                    System.out.print("*"); 
                }
            }else{
                System.out.print("*");
                for(int cl=1;cl<=n-2;cl++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }       
    }
    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsinRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsinRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col + " ");    
           }
           for (int col = 2; col <= row; col++){
                System.out.print(col + " ");
           }  
           System.out.println(" ");  
        }
    }
    static void pattern31(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            for (int col = 1; col <= 2*n-1; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern31a(int n){
        int originalN = n;
        for (int row = 1; row <= 2*n-1; row++) {
            for (int col = 1; col <= 2*n-1; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col))+1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern36(int n){
        for (int row = 1; row <= n; row++) {
            System.out.print("* ");
            for (int col = 1; col <= n-1 ; col++) {
                System.out.print("-");
            }
            System.out.print(" *");
            System.out.println();
        }
    }
    static void pattern37(int n){
        for (int row = 1; row <= n; row++) {
            System.out.print("* ");
            for (int col = 1; col <= n-row ; col++) {
                System.out.print("-");
            }
            if (row != n) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern38(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row +1; col++) {
                if (col<= n-row) 
                    System.out.print(col + " ");
                else
                System.out.print(col);  
            }
            System.out.println();
        }
    }
    static void pattern39(int n){
        /*  39. **********
                ****  ****
                ***    ***
                **      **
                *        *      */
        for (int row = 0; row <=n; row++) {
            int nstars = n-row;
            int nspaces = 2*row;
            for(int st = 1;st<=nstars;st++){
                System.out.print("*");
            }
            for(int sp = 1;sp<=nspaces;sp++){
                System.out.print(" ");
            }
            for(int st = 1;st<=nstars;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern40(int n){
        /*  40. *        *
                **      **
                ***    ***
                ****  ****
                **********  */
        for (int row = 1; row <= n; row++) {
         int nstars = row;
         int nspaces = 2*(n-row);
         for(int st=1;st<= nstars;st++){
            System.out.print("*");
         }
         for(int sp=1;sp<=nspaces;sp++){
            System.out.print(" ");
         }
         for(int st=1;st<= nstars;st++){
            System.out.print("*");
         }
         System.out.println();
        }
    }
    static void pattern41(int n){
        /*  41.   1
                 12
                123
               1234
              12345     */
        for(int row =1;row<=n;row++){
            int nspaces = n-row;
            for(int sp=1;sp<=nspaces;sp++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                int num = col;
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
    }
    static void pattern42(int n){
        for(int row =1;row<=n;row++){
            int nspaces = n-row;
            int ncols = 2*row-1;
            for(int sp=1;sp<=nspaces;sp++){
                System.out.print(" ");
            }
            int num = row;
            for(int col=1;col<=ncols;col++){
                System.out.print(num);
                if(col<=ncols/2)
                    num = num+1;
                else
                    num=num-1;
            }
            System.out.println();
        }
    }
    static void pattern43(int n){
        int i = 1;
        for(int row =n;row>=1;row--){
            int nspaces = row-1;
            int ncols = 2*i-1;
            for(int sp=1;sp<=nspaces;sp++){
                System.out.print("-");
            }
            for(int col=1;col<=ncols;col++){
                System.out.print(col*row); 
            }
            System.out.println();
            i=i+1;
        }
    }
}

// 10.      *
//         * *
//        * * *
//       * * * *
//      * * * * *

// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *

// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

// 13.      *
//         * *
//        *   *
//       *     *
//      *********

// 14.  *********
//       *     *
//        *   *
//         * *
//          *

// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1

// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********

// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

// 29.      
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5


// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4   

// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E

// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o
     
// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A
       
// 35.    1      1
//        12    21
//        123  321
//        12344321
