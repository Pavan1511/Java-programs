
public class ReverseWord {
	public static void main(String[] args) {
		String s = "Virat is the best batsman";
		String[] s1 = s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++) {
			StringBuilder sb = new StringBuilder(s1[i]);
			sb = sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
