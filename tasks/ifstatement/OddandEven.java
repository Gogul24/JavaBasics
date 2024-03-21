package tasks.ifstatement;
import java.util.Scanner;

public class OddandEven {
	public static void main(String[] args) {
		int [] arr = {3,4,5,66,77,32,4,6,8};
		System.out.print("Even numbers : ");
		eveN(arr);
		System.out.println();
		System.out.print("Odd numbers : ");
		odD(arr);
		System.out.println();
		System.out.print("Duplicate values : ");
		duplicates(arr);
	}	
	public static void eveN(int[] arr) {
		int[] even= new int[50];
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[x]=arr[i];
				System.out.print(even[x]+",");
				x++;
	}
			}	
	}
	
	public static void odD(int[] arr) {
		int[] odd=new int[50];
		int y=0;
		for(int i=0;i<arr.length;i++) {
			if(!(arr[i]%2==0)) {
				odd[y]=arr[i];
				System.out.print(odd[y]+",");
				y++;
}
			}
		}
	
	public static void duplicates(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					count++;
				}
			}
		}System.out.println("\n"+"Total duplicate values : "+count);
	}
	}
