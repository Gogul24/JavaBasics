package task;

import java.util.Scanner;

public class InsertionSort {

	static void insertSort(int arr[],int n) {
		int key,temp;
		for(int step=1;step<n;step++) {
			key = step;
			for(int i=step;i>0;i--) {
				if(arr[key]<arr[i-1]) {
					temp=arr[key];
					arr[key]=arr[i-1];
					arr[i-1]=temp;
					key--;
				}
			}
		}
	}
	static void printArray(int arr[],int n) {
		System.out.println("Array element after sorting");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+",");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		insertSort(arr, n);
		printArray(arr, n);

	}

}
