package beginners;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountOfWords {
 
      public void countOfWord(){
    	  Scanner s = new Scanner(System.in);
    	  System.out.println("Enter a String");
    	  String str= s.nextLine();
    	  StringTokenizer st = new StringTokenizer(str," ");
    	  System.out.println(st.countTokens());
    	  s.close();
    	  
      }
	
	public static void main(String[] args) {
     CountOfWords c = new CountOfWords();
     c.countOfWord();
	}
}
