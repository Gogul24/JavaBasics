package linearsearch;

public class LinearRecurseMain {
	
	public static int recurseLinerar(int[] arr,int i,int a) {
		if(i<arr.length) {
			if(arr[i]==a) {
				System.out.println("index :"+i+"  "+"Value :"+arr[i]);;
			}
			recurseLinerar(arr, ++i, a);
		}
		return i;
	}
	
	public static int primeRecurese(int[] arr,int i) {
		if(i<arr.length) {
			if(arr[i]%1==0 && arr[i]%i!=0 ) {
				System.out.print(arr[i]+",");
			}primeRecurese(arr, ++i);
		}
		return i;		
	}
	
	public static int binaryRecurse(int[] arr,int x,int y,int n) {
		if(x<=y) {
			int mid = (x+y)/2;
			if(arr[mid]==n) {
				System.out.println(arr[mid]);
				return 0;
			}
			else if(arr[mid]<n) {
				x=mid+1;
			}
			else if(arr[mid]>n) {
				y=mid-1;
			}
		}
		return binaryRecurse(arr, x, y, n);
	}
	
	public static void patternPrint(int n,int i,int j) {
		if(i<n) {
			if(j<n) {
				if(j==i || i==n-1||j==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				patternPrint(n,i,j+1);
				return;
			}
		}
		System.out.println();
		if(j>=n && i<n)
			patternPrint(n, i+1, 0);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,22,33,44,66,77,88};
//		recurseLinerar(arr, 0, 88);
//		System.out.println("***********************************");
//		primeRecurese(arr, 1);
//		System.out.println("\n"+"***********************************");	
//		binaryRecurse(arr, 0, arr.length, 33);
		patternPrint(5,0,0);
		
		
	}
}
