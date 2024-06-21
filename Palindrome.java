import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(check(str));
	}
	
	static boolean check(String str){
	    int start = 0;
	    int end = str.length() - 1;
	    
	    while(start <= end){
	        if(str.charAt(start) != str.charAt(end)){
	            return false;
	        }
	        start++;
	        end--;
	    }
	    
	    return true;
	}
}
