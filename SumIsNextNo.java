import java.util.Scanner;

class SumIsNextNo{
public static void main (String[] args) throws java.lang.Exception{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = s.nextInt();
		}
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				for(int k=0;k<size;k++){
					if(array[i] + array[j] == array[k]){
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}
	}
}
