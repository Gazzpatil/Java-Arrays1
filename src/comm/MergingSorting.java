package comm;

public class MergingSorting {

	public static void main(String[] args) {
		int[] a= {10,30,50,103,60,102};
		int[] b= {20,50,90,100,101};
		int[] c=merg(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
	static int[] merg(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
		
		return c;
	}

}
