package fsd.datatype;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {

		Integer a=100;
		Integer b=-33;
		Double c=12.7;
		Double d =11.7;
		Integer x1 = 32;
		Integer x2 = 16;
		Double x3=Math.sqrt(x1);
		Double x4=Math.sqrt(x2);
		Double a1=37.5;
		Double b1=22.3;
		Double c1=31.6;
		Integer d1=99;
		Double n1 = Math.floor(c1)+Math.floor(a1)+Math.floor(b1)+d1;
		
		System.out.println(Math.round(n1));
		
		
		System.out.println(Math.round(x3) +":"+Math.round(x4));
		
		
		System.out.println("abs :"+Math.abs(b));
		System.out.println("negate :"+Math.negateExact(a));
		System.out.println("ceil :"+Math.ceil(c));
		System.out.println("Floor :"+Math.floor(c));
		System.out.println("Round :"+Math.round(c));
		System.out.println("Square root :"+Math.sqrt(a));
		System.out.println("Max :"+Math.max(c,d));
		System.out.println("Min :"+Math.min(a,b));
		System.out.println("Random :"+Math.random());
		System.out.println("power of :"+Math.pow(21,3));
		System.out.println("power of :"+Math.exp(d));
		
		Random r = new Random();
		System.out.println("Random numbers : "+r.nextDouble(1.45,999.99));
		
		int[] arr = {21,17,13,113,119};
		int count=0;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					
					}
				}
			}
		}
		
	}
