package comm1;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,-4,0,3,2,0};
		int[] temp=arr;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]!=0&&arr[j+1]==0) {
				int temp1=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp1;
			}
			}
		}
	}

}
