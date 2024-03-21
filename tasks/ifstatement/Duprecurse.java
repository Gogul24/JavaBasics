package tasks.ifstatement;

import java.awt.Event;

public class Duprecurse {

	public static void main(String[] args) {
		int [] arr= {3,5,7,31,2,3,4,61,51};
		dupli(arr,0,1);
		System.out.println("\n"+"--------ODD NUM------------------------------");
		odd(arr, 0);
		System.out.println("\n"+"--------EVEN NUM-----------------------------");
		even(arr,0);
	}
	public static int dupli(int[] arr,int i,int j) {
		
		if(j<arr.length-1) {
			j++;
		}
		else {
			i++;
				j=i+1;
		}
		
		if(i<arr.length-1) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+",");
			}
			dupli(arr,i,j);
			
		}
		return arr[i];
	}
	
	public static int[] odd(int[] arr,int i) {
		
		if(i<arr.length) {
			if(arr[i]%2 != 0) {
			System.out.print(arr[i]+",");
			}i++;
				odd(arr,i);
		}
		return arr;	
	} 
	
	public static int[] even(int[] arr,int i) {
		if(i<arr.length) {
			if(arr[i]%2 == 0) {
			System.out.print(arr[i]+",");
			}i++;
				even(arr,i);
		}
		return arr;
	}
}
	
	

