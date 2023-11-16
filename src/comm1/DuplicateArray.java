package comm1;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		int[] ar1= {8,4,3,2};
		int[] c=Dup(ar,ar1);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}
	static int[] Dup(int[] ar,int[] ar1) {
		int[] d=new int[ar.length];
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar1.length;j++) {
				if(ar[i]==ar1[j]) {
					d[count]=ar[i];
					count++;
				}
			}
		}
		int[] e=new int[count];
		for(int i=0;i<e.length;i++) {
			e[i]=d[i];
		}
		return e;
	}

}
