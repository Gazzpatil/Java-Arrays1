package comm;
import java.util.Scanner;
public class PrimeInArray {

	public static void main(String[] args) {
	int[] y=	readArray();
	   dispArray(y);
	 getPrimeNum(y);  
	}
	
	static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values");
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	
	}
	
	static void dispArray(int[] x) {
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
	}
	static void getPrimeNum(int[] ar) {
		
		for(int i=0;i<=ar.length-1;i++) {
			int count=0;
			for(int j=1;j<=ar[i];j++) {
				if(ar[j]%2==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(ar[i]+" ");
				
			}
		}
	}

}
