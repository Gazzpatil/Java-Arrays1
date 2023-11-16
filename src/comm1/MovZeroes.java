package comm1;

public class MovZeroes {

	public static void main(String[] args) {
		int[] arr= {-1,-4,0,3,2,0,10,0,78};
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count]=0;
			count--;
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
			}

}
