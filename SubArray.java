/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		int subArr[] = new int[3];
		for(int i=size-3;i<size-1;i++){
			for(int j=0;j<3;j++){
				subArr[j] = arr[i];
			}
		}
		for(int i=0;i<3;i++){
		    System.out.print(subArr[i]);
		}
		
	}
}
