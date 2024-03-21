package tasks.ifstatement;

public class DualBoxpattern {

	public static void main(String[] args) {
		int n=21;
		duabox(n);
		System.out.println();
		//box(n);
	}
			
		public static void duabox(int n) {
			int mid =n/2;
			int d1 = mid+1;
			int d2=n;
			for(int i=0;i<n;i++) {
				d1--;
				if(d2>=mid && i>=mid) {
					d2--;
				}
				
				for(int j=0;j<n;j++) {
					
					if((i==0 && j<=mid)||(j==0 && i<=mid)||(j<=mid && i==mid)||j==mid && i<=mid) {
					System.out.print("* ");
					}
					else if((i==mid && j>=mid)||(i>=mid && j==mid)||(i==n-1 && j>=mid) ||(j==n-1 && i>=mid)||(j==i)||j==d1) {
						System.out.print("* ");
					}
					else if(j==d2 && i>= mid){
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}System.out.println();
		}
	}
		
		public static void box(int n) {
			int mid = n/2;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if((j<=mid && i<=mid)||(i>=mid && j>=mid)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}System.out.println();
			}
		}

}