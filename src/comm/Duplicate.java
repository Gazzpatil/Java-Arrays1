package comm;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= {10,20,70,80,90,20};
		int[] b= {20,50,70,80,25,45};
		
		int[] c= duplicate(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	static int[] duplicate(int[] a,int[] b) {
		int[] c= new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if (a[i]==b[j]) {
					c[k]=a[i];
					k++;
					break;
				}
			}	
		}
		int[] z=new int[k];
		for(int i=0;i<k;i++) {
			z[i]=c[i];
		}
		return z;
		
	}

}
