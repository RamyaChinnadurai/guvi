import java.util.Scanner;
class UniqueNo{
public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s = new Scanner(System.in);
	   int size = s.nextInt();
	   int[] arr = new int[size];
	   int[] count = new int[size];
	   for(int i=0;i<size;i++){
	   	 arr[i] = s.nextInt();
	   	   int flag=0;
	   	   for(int j=0;j<size;j++){
	   	   	if(arr[i]==arr[j]){
	   	   		flag++;
	   	   	}
	   	   }
	   	   count[i]=flag;
	  }
	  int ind=0;
	  for(int i=0;i<size;i++){
	  	if(count[i]==1){
	  		ind=i;
	  	}
	  }
	  System.out.println("Unique no is "+ arr[ind]);
	}
}
