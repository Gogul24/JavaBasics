package tasks.ifstatement;
public class Highestval1 {
	public static void main(String[] args) {
		int[] arr= {9,6,7,6,8,9,45,67};
		int temp=0;
		int loW=0;
		for(int i =0;i<arr.length;i++)	
		{
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}System.out.println("Highest value is :"+arr[arr.length-1]);
	System.out.println("-----------------------------");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		loW=arr[0];
	}
	System.out.println();
	System.out.println("_____________________________");
	System.out.println("The lowest value is : "+loW);
}}
