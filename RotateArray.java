import java.util.Scanner;

public class RotateArray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = s.nextInt();
		}
		int d = s.nextInt();
		int res[] = new int[size];
		int ind=0;
		for(int i=d;i<size;i++){
			res[ind]=arr[i];
			ind++;
		}
		for(int i=0;i<d;i++){
			res[ind] = arr[i];
			ind++;
		}
		for(int i:res){
			System.out.print(i+" ");
		}
	}
}
