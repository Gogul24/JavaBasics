package sorting;

public class MergeSort2 {

	public static void merge(int[] arr) {
		int mid=((arr.length)-1)/2;
		int y=0,y1=arr.length,x1 = 0,mid1=0,mid2=0;
		int i=0;int x=0;
		 while(i<y1) {
			 if(i<=mid) {
				 y=mid;
				 mid1=mid/2;
				 x1=mid+1;
				 mid2=(x1+y1)/2;
				 
				 if(i>=x && i<=mid1){
					 System.out.println("lesser mid1 :"+arr[i]);
				 }
				 else  {
					 if(i<=y) {
					 System.out.println(" greater mid1 :"+arr[i]);
					 }
				 }
			 }
			 else if(i>=x1 && i<=mid2) {
				 System.out.println("lesser mid2 :"+arr[i]);
			 }
			 else if(i>mid2 && i<=y1) {
				 System.out.println(" greater mid2 :"+arr[i]);
			 }
			 i++;
		 }
	} 
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		merge(arr);
		}

}
