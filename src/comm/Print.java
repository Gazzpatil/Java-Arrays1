package comm;
import java.util.Scanner;
public class Print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  size");
		int size =sc.nextInt();
		String[] s= new String[size];
		System.out.println("Enter "+size+"value");
		for(int i=0;i<=s.length-1;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(i+ " "+s[i]);
		}

	}

}
