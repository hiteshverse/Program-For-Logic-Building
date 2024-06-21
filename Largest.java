import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3){
		    System.out.println("Max: " + num1);
		} else if (num2 >= num1 && num2 >= num3){
		    System.out.println("Max: " + num2);
		} else {
		    System.out.println("Max: " + num3);
		}

	}
}
