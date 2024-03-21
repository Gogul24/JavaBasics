package fsd.datatype;

public class PrimeNumbers {

	
	public static void findPrimeNumber(Integer[] arr) {
        for (int i : arr) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            } else {
            	System.out.println(i + " is not a prime number");
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    } 	
    public static void main(String[] args) {
    	Integer[] num = {21,13,17,113,119};
    	findPrimeNumber(num);
    }
}
