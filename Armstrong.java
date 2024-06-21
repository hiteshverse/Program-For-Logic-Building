import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++){
		    int num = sc.nextInt();
		    System.out.println(check(num));
		}

	}
	
	static boolean check(int x){
	    int copy = x;
	    int digits = (int) Math.log10(x) + 1;
	    int sum = 0;
	    
	    while(x != 0){
	        int ld = x % 10;
	        sum += Math.pow(ld, digits);
	        x /= 10;
	    }
	    
	    return copy == sum;
	}
}
