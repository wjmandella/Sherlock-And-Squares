


import java.util.Scanner;

public class SherlockAndSquares {
    static int squares(int a, int b) {
    	System.out.println("Square root of B = "+Math.sqrt(b));
    	System.out.println("Floor of square root of B =" +Math.floor(Math.sqrt(b)));
    	System.out.println("Square root of A = "+ Math.sqrt(a));
    	System.out.println("Ceiling of square root of A = "+ Math.ceil(Math.sqrt(a)));
    	System.out.println("Difference pre-integerizing: "+ (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))));
        return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
      }
    
// The following also "works" but times out for very large values for b.
    
//    	int nbrOfSquares = 0;
//    	for(int i = a; i <= b; i++) {
//    		for(int j = (int) Math.sqrt(a); j <= (int) Math.sqrt(b); j++) {
//    			if( j * j == i) {
//    				System.out.println("j * j = "+ (j * j));
//    				nbrOfSquares++;
//    			}
//    		}
//    	}
//    	
//    	return nbrOfSquares;
    	


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of test cases, t (integer 1-100): "); 
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter the lower bound value, A (integer 1-1000000000): "); 
            int a = in.nextInt();
            System.out.print("Enter the upper bound value, B (integer 1-1000000000, but greater A): "); 
            int b = in.nextInt();
            int result = squares(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
