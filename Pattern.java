package task;

public class Pattern {

	public static void main(String[] args) {
		int n=21;
		int mid = n/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 || i==n-1 || j==n-1)||(i==j && i>mid) || (j==n-i-1 && j >=mid )) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern(int n) {
		int mid=n/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 && i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
