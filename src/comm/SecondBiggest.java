package comm;

public class SecondBiggest {

	public static void main(String[] args) {
		int[] arr= {30,60,70,90,98,44,99};
		int big=0;
		int sbig=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big) {
				sbig=big;
				big=arr[i];
			}
			if(arr[i]>sbig&&arr[i]<big) {
				sbig=arr[i];
			}
		}
		System.out.println("Second biggest number is " + sbig);

	}

}
