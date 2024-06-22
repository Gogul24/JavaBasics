package task;

import java.util.Scanner;

public class arrangements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements : ");
		n=sc.nextInt();
		int arr[] = new int[n];
		int temp[]=new int[n];
		int large = n-1,small =0,flag=0;
		System.out.print("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Rearrangement of arry elements");
		for(int i =0;i<n;i++) {
			if(flag ==0 ) {
				temp[i] = arr[large];
				large--;
				flag=1;
			}
			else {
				temp[i]=arr[small];
				small++;
				flag=0;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(temp[i]+",");
		}
	}

}
