import java.util.Scanner;

public class RoundOff {
	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter a no ");
     double num = s.nextDouble();
     System.out.println(Math.round(num));
	s.close();
	}

}
