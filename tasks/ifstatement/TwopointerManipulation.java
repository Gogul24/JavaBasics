package tasks.ifstatement;

public class TwopointerManipulation {

	
	
	public static boolean twopointer(int[] arr) {
		int n =66;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					return true;
				}	
			}
		}
		return false;
	}
	
	public static void asc(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}System.out.print(i+":"+arr[i]+",");
		}
	}
	
	public static void dec(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}System.out.print(i+":"+arr[i]+",");
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {5,6,10,12,8};
		System.out.println(twopointer(arr));
		dec(arr);
		System.out.println();
		asc(arr);
	}

}
