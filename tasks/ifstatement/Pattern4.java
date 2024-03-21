package tasks.ifstatement;

public class Pattern4 {

	public static void main(String[] args) {
		int s=5;
		righT(s);
		System.out.println();
		left(s);
	}
	public static void righT(int s) {	
		int k=0;
		for(int i=0;i<=s;i++) {
			for(k=s-i;k>=0;k--) {
				System.out.print(" ");}
			for(int j=i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		} 
	}
	public static void left(int s) {
		for(int i=0;i<=s;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	}