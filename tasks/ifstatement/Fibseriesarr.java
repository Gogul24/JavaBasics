package tasks.ifstatement;

import java.util.Scanner;

public class Fibseriesarr {

	public static void main(String[] args) {
		int s=5;
		int []num = new int[s];	
		num[0]=1;
		num[1]=1;
		int total;
		total=num[0]+num[1];
		for(int i=2;i<s;i++)
		{
			
			num[i]=num[i-1]+num[i-2];
			total = total + num[i];
			
		}
		System.out.println(total);
	}

}
