package comm1;

public class Zigzag1 {

	public static void main(String[] args) {
		int [] a= {10,30,50,70,55};
		int[] b= {20,40,60,100};
		int[] c=zigzag(a,b);
		for(int i=0;i<=c.length-1;i++) {
			System.out.print(c[i]+" ");
		}
	}
	static int[] zigzag(int[] a,int[] b) {
		int[] arr=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			arr[j]=a[i];
			j++;
			arr[j]=b[i];
			i++;
			j++;
		}
		while(i<a.length) {
			arr[j]=a[i];
			j++;
			i++;
		}
		while(i<b.length) {
			arr[j]=b[i];
			j++;
			i++;
		}
		return arr;
	}
}


