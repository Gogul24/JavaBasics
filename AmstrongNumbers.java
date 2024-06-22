package task;
public class AmstrongNumbers {

	    public static void main(String[] args) {
	        for(int i=0;i<1000;i++) {
	        	isArmstrong(i);
	        }
	    }
	    
	    static void isArmstrong(int n) {
	        int temp = n,rem,sum=0;
	        String s = String.valueOf(n);
	        int len =s.length();
	        while (n > 0) {
	            rem = n % 10;
	            sum+=Math.pow(rem, len);
	            n = n/10;
	        }
	        if (sum == temp)
	            System.out.println(temp + " is an Armstrong number.");       
	    }
}

