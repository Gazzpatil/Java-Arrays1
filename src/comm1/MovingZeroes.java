package comm1;

public class MovingZeroes {

	public static void main(String[] args) {
		int[] arr= {1,5,7,0,2,6};
		moveZeroes(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	static void moveZeroes(int[] arr) {
		if(arr.length==0 || arr.length==1)
			return;
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		
	}

}
