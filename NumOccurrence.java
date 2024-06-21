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
        int target = sc.nextInt();
        
        int count = 0;
        while(num != 0){
            int ld = num % 10;
            if(ld == target){
                count++;
            }
            num /= 10;
        }
        
        System.out.println(count);
	}
}
