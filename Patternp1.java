package task;

public class Patternp1 {

	public static void main(String[] args) {
		int n= 7;
		int k =1;
		int mid = n/2;
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i>=j) {
				System.out.print(k++);
				}
				else {
					System.out.print(" ");
				}
			}k--;
			System.out.println();
		}
	}
}
