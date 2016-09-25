/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedListPalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    LinkedList<Character> list = new LinkedList<Character>();
	    int n = s.nextInt();
	    for(int i=0;i<n;i++){
	    	char a = s.next().charAt(0);
	    	list.add(a);
	    }
	    LinkedList<Character> list1 = new LinkedList<Character>(list);
	    Collections.reverse(list);
	    if(list.equals(list1)){
	    	System.out.println("Palindrome");
	    }
	    else{
	    	System.out.println("Not Palindrome");
	    }
	    
	}
}
