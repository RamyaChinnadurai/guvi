/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TallestStudent
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int[] h = new int[50];
		for(int i=0;i<50;i++){
			h[i] = s.nextInt();
		}
		Arrays.sort(h);
		System.out.println(h[3]);
		int k=s.nextInt();
		System.out.println(h[k-1]);
		
	}
}
