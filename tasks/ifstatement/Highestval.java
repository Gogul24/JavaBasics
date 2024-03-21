package tasks.ifstatement;

public class Highestval {

	public static void main(String[] args) {
		
		int[] arr= {9,7,4,9,7,9,7};
		int temp=0;
		int hiGhest=0;
		for(int i =0;i<arr.length;i++)	
		{
			for(int j=0;j<arr.length;j++) {
			if(arr[i]>=arr[j]) {
				temp=arr[i];
			}
			else {
				hiGhest=arr[j];
			}
			
			}if(hiGhest>=temp) {
				temp=hiGhest;
		}	
	}System.out.println(temp);
  }
}
