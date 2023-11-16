package comm1;
import java.util.Scanner;
public class SecondBiggest {

	public static void main(String[] args) {
		int[] ar= {61,20,31,21,30};
		
		int fbig=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>fbig) {
			int temp=fbig;
			fbig=ar[i];
			sbig=temp;
//				sbig=fbig;
//				fbig=ar[i];
			}
			if(ar[i]>sbig && ar[i]<fbig) {
				sbig=ar[i];
			}
		}
		System.out.println("fbig:"+fbig+" "+"sbig"+sbig);

	}

}
