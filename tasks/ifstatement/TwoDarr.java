package tasks.ifstatement;

public class TwoDarr {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("-------------------- ROW REVERSE");
		rowRev(arr);
		System.out.println("--------------------------------");
		colRev(arr);
		System.out.println("==============================");
	}
		
		public static void rowRev(int[][] arr) {
			
		for(int i=arr.length-1;i>=0;i--) {
			int[] val = arr[i];
			for(int j=0;j<val.length;j++) {
				System.out.print(val[j]);
			}
			System.out.println();
		}
		
	}
		
		public static void colRev(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				int[] val = arr[i];
				for(int j=val.length-1;j>=0;j--) {
					System.out.print(val[j]);
				}
				System.out.println();
			}
		}
	}

