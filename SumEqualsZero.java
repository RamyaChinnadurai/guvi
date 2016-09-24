/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumEqualsZero
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int size = s.nextInt();
	    int[] arr = new int[size];
	    for(int i=0;i<size;i++){
	    	arr[i] = s.nextInt();
	    }
	    for(int i=0;i<size-1;i++){
	    	for(int j=i+1;j<size;j++){
	    		if(arr[i]+arr[j]==0){
	    			System.out.println(arr[i] +" " + arr[j]);
	    		}
	    	}
	    }
	}
}
