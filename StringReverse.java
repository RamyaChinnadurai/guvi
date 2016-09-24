/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StringReverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner s = new Scanner(System.in);
	     String str = s.nextLine();
	     String arr[] = str.split(" ");
	     String rev = "";
	     for(int i=0;i<arr.length;i++){
	     	StringBuffer sb = new StringBuffer(arr[i]);
	     	rev += sb.reverse().toString()+" ";
	     }
	     System.out.println(rev.trim());
	   }
}
