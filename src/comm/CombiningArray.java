package comm;
import java.util.Scanner;
public class CombiningArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size1=sc.nextInt();
		int[] a= new int[size1];
		System.out.println("Enter "+size1+" Value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int size2=sc.nextInt();
		int[] b= new int[size2];
		System.out.println("Enter "+size2+" Value");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Printing the values");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

		int[] c= comb(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}
	static int[] comb(int[] a,int[] b) {
		int[] combine=new int[a.length+b.length];
		for(int i=0;i<combine.length;i++) {
			combine[i]=a[i];
			combine[a.length+1]=b[i];
		}
		return combine;
	}
	

}
