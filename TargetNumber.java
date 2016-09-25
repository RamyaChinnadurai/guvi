/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TargetNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i] = s.nextInt();
		}
		int target = s.nextInt();
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(arr[i]+arr[j]==target){
					System.out.print(arr[i]+" "+arr[j]+" ");
					break;
					
				}
			}
		}
	}
}
