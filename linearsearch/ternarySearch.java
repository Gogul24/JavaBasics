package linearsearch;

public class ternarySearch {
	
		private static int ternarySearch(int start,int end,int[] arr,int n,int res) {
			
			if(start<=end) {
				int mid1= start+(end-start)/3;
				int mid2 = end-(end-start)/3;
				
				if(arr[mid1]==n) {
					res= mid1;
					return mid2;
				}
				if(arr[mid2]==n) {
					res = mid2;
					return mid2;
				}
				if(arr[mid1]>n) {
					res = ternarySearch(start, mid1-1, arr, n, res);
				}
				else if(arr[mid2]<n) {
					res =ternarySearch(mid2+1, end, arr, n, res);
				}
				else {
					res = ternarySearch(mid1+1, mid2-1, arr, n, res);
				}
			}return res;
		}
}
