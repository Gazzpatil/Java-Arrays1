package comm;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,1,2};
	int a=	remove(arr);
	System.out.println(a);
	}
	static int remove(int[] a) {
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(i<a.length-1 && a[i]==a[i+1]){
				continue;
			}
			else {
				a[count]=a[i];
				count++;
			}
		}
		return count;
	}

}
