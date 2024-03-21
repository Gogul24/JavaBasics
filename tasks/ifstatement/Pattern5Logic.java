package tasks.ifstatement;

public class Pattern5Logic {
	
	public  void patterPrint(int n) {
		int i=0;
		int mid = (n/2);
		while(i<n) {
			int j=0;
			while(j<n) {
				if(i==j && i<=mid && j<=mid) {
				System.out.print("*");
				}
				else if(j==n-i && i<mid) {
					System.out.print("*");
				}
				else if(i>=mid && j==mid) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
