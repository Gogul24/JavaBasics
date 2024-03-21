package Arraylist;

import java.util.ArrayList;

public class ArrayOddEvn {
	
	public ArrayList<Integer> Odd(ArrayList<Integer>arrx, boolean isOdd) {
		
		
		
		ArrayList<Integer>oddnum = new ArrayList<Integer>();
		
		for(int i=0;i<arrx.size();i++) {
			if(arrx.get(i)%2!=0 && isOdd) {
				oddnum.add(arrx.get(i));	
			}
			else if(arrx.get(i)%2==0 && !isOdd)  {
				oddnum.add(arrx.get(i));
			}
		}
		return oddnum;
	}
	
	public void printodd(ArrayList<Integer>oddnum) {
		System.out.print(" numbers : ");
		for(int i=0;i<oddnum.size();i++) {
			System.out.print(oddnum.get(i)+",");
		}
	}
		
		
	
}
