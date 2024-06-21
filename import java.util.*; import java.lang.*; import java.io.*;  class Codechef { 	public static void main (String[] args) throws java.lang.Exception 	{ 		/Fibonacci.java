import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(fibonacci(num));
	}
	
	static int import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(fibonacci(num));
	}
	
	static int fibonacci(int n){
	    int first = 0;
	    int second = 1;
	    int next = 0;
	    
	    if(n < 2){
	        return n;
	    }
	    
	    for(int i = 2; i <= n; i++){
	        next = first + second;
	        first = second;
	        second = next;
	    }
	    
	    return next;
	}
}
(int n){
	    int first = 0;
	    int second = 1;
	    int next = 0;
	    
	    if(n < 2){
	        return n;
	    }
	    
	    for(int i = 2; i <= n; i++){
	        next = first + second;
	        first = second;
	        second = next;
	    }
	    
	    return next;
	}
}
