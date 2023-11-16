package comm;import java.util.Scanner;
public class UniqueElement {

	public static void main(String[] args) {
		int[] arr= {10,10,30};
		int a=unique(arr);
		System.out.println(a);
	}
	static int unique(int[ ] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum^a[i];
		}
		return sum;
	}
	

}
