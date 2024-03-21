package sorting;

public class MergeSort {

		public static int[] mergeSort(int [] arr, int l, int r) {
			if(l<r) {
				int middle =(r+l)/2;
				System.out.println("method call "+l+":"+r);
				
				int [] rFinal = mergeSort(arr, middle+1, r);
				int [] lFinal = mergeSort(arr, l, middle);
				sort(arr,l,r,middle);
				
				System.out.println("method return "+l+":"+r);
			}
			return arr;
		}
		public static void sort(int[] arr,int l,int r,int middle) {
			int n1size = middle-l+1;
			int n2size = r-middle;
			
			int larr[] = new int[n1size];
			int rarr[]=new int[n2size];
		for(int i =0;i<n1size;i++) {
			larr[i] = arr[l+i];
		}
		for(int j=0;j<n2size;j++) {
			rarr[j]=arr[middle + l+j];
		}
		int i=0,j=0,arrposition =l;
		
		while(i<n1size && j< n2size) {
			if(larr[i]<=rarr[j]) {
				arr[arrposition]=larr[i];
				i++;
			}
			else {
				arr[arrposition]=rarr[j];
				j++;
				arrposition++;
			}
		}
		}
	
	
		public static void main(String[] args) {
			int[] arr= {21,9,12,16,17,2,9};
			mergeSort(arr, 0, arr.length-1);
		}
}
