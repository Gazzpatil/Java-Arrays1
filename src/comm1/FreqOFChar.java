package comm1;

public class FreqOFChar {

	public static void main(String[] args) {
		String str="GAJANAND";
		int[] count=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+" "+ count[i]);
			}
		}

	}

}
