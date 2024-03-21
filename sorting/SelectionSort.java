package sorting;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=arr[temp];
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {                    
		for(int i =0;i<arr.length;i++) {
			int currentVal = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>currentVal ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=currentVal;
		}return arr;
	}
	
	public static void main(String[] args) {
		int [] arr= {9,16,18,17,2};
		System.out.println("INSERTION SORT");
		int[] arr1 = insertionSort(arr);
		for(int a=0;a<arr1.length;a++) {
			System.out.print(arr1[a]+",");
		}
		
		System.out.println("SELECTION SORT");
		int[] arr2 = selectionSort(arr);
		for(int a=0;a<arr2.length;a++) {
			System.out.print(arr2[a]+",");}
	}

}
