package task;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rotations : ");
		int rot = sc.nextInt();
		int x;
		int arr[]= {1,2,3,4,5};
		int n = arr.length;
		for(int r=0;r<rot;r++) {
			x=arr[n-1];
			for(int i=n-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=x;
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+",");
			sc.close();
		}
	}
	
}
		
	
		
	
	

