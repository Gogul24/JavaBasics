package tasks.ifstatement;
public class Recursiveloop {

	public static void main(String[] args) {
		int[] arr= {3,5,8};
		int[] aseRec=asc(arr,0,0);
		System.out.println("asc");
		print(aseRec);
		System.out.println("\n"+"desc");
		int[] desRec=des(arr,0,0);
		print(desRec);
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static int[] asc(int[] arr,int i,int j) {
		if(j< arr.length-1) {
			j++;
		}
		else {
			j=0;
			i++;
		}
		if(i<arr.length) {
			if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			asc(arr,i,j);
		}
		return arr;
	}
	public static int[] des(int[] arr,int i,int j) {
		if(j<arr.length-1) {
			j++;
		}
		else {
			j=0;
			i++;
		}
		if(i<arr.length) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			des(arr,i,j);
		}
		return arr;
	}
}
