package tasks.ifstatement;

public class Duplicatedval {

	public static void main(String[] args) {
		int[] arr= {1,3,4,6,6,7,2,4,5,8,7,65,44};
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
