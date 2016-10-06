import java.util.Scanner;

public class StringMultiply {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String no1 = s.next();
		String no2 = s.next();
		String res = Integer.toString(Integer.parseInt(no1) * Integer.parseInt(no2));
		System.out.println(res);
	}
}
