import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z'){
		    System.out.println("It's a UpperCase Letter");
		} else if(ch >= 'a' && ch <= 'z'){
		    System.out.println("It's a LowerCase Letter");
		} else {
		    System.out.println("It's not a valid Character");
		}
    
	}
}
