/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArraySubset
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int size1 = s.nextInt();
		int[] array = new int[size];
		int[] array1 = new int[size1];
		int count=0;
		for(int i=0;i<size;i++){
			array[i] = s.nextInt();
		}
		for(int i=0;i<size1;i++){
			array1[i] = s.nextInt();
		}
		for(int i=0;i<size;i++){
			for(int j=0;j<size1;j++){
				if(array[i] == array1[j]){
					count++;
					break;
				}
			}
		}
		if(count==0){
			System.out.println("Array1 is not a subset of Array2");
		}
		else{
			System.out.println("Array1 is subset of Array2");
		}
	}
}
