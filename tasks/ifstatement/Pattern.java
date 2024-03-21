package tasks.ifstatement;

public class Pattern {

	public static void main(String[] args) {
			int n=31;
			
			int mid=n/2;
			int mid2=(mid/2);
			for(int i =0 ;i<n;i++) {
				
				for(int j=0;j<n/2;j++) {
					if( i==mid2 || i==j || mid2 == j || j== ((n/2)-i-1)) {
						System.out.print("* ");
					}

					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
	}

}
