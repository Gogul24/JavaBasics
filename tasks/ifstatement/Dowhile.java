package tasks.ifstatement;

public class Dowhile {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
	/*	int i=-1;
		do{
			i++;
			System.out.println(arr[i]);
			
		}
		while(i<arr.length-1); */
		
		int i = arr.length-1;
		
		do {
			System.out.println(arr[i]);
			i--;
		}
		while(i>=0);
	}}