package comm;
import java.util.Scanner;
public class ReversingArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  the size:");
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	System.out.println("enter "+size+" values in an array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Display the arrray");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	int [] rev=revArr(arr);
	System.out.println("After reversing the array");
	for(int i=0;i<rev.length;i++)
	{
		System.out.print(rev[i]+" ");
	}
	}
	static int[]  revArr(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		return arr;
	}

}
