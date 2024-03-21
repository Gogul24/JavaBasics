package tasks.ifstatement;

public class Recursivemethod {

	public static void main(String[] args) {
		int[] arr = {3,4,6,7,8,90,0};
		int i = 0;
		int j=arr.length-1;
		recurse(arr,i);
		System.out.println();
		revrec(arr, j);
		
	}
	public static int recurse(int[]arr,int i) {
		if(i<arr.length) {
			System.out.print(arr[i]+",");
			i++;
			recurse(arr,i);
		}return i;
	}
	public static int revrec(int[]arr,int j) {
		
		if(j>=0) {
			System.out.print(arr[j]+",");
			j--;
			revrec(arr, j);
		}return j;
	}
}