package task;

public class PetersonNumber {

	public static void main(String[] args) {
		
		int n = 145;
		int rem;
		String s = String.valueOf(n);
		while(n>0) {
			rem = n%10;
			int temp=1;
		    temp = temp * rem;
			System.out.println(temp);
			n=n/10;
		}

	}

}
