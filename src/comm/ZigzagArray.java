package comm;

public class ZigzagArray {

	public static void main(String[] args) {
		int[] a= {10,20,50,80};
		int[] b= {5,40,60,70};
		
		int [] z=zigzag(a,b);
		for(int i=0;i<=z.length-1;i++) {
			System.out.print(z[i]+" ");
		}

	}
	static int[] zigzag(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			i++;
			j++;
		}
		while(i<a.length) {
			c[j]=a[i];
			i++;
			j++;
		}
		while(i<b.length) {
			c[j]=b[i];
			i++;
			j++;
		}
		return c;
	}

}
