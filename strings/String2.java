package strings;

public class String2 {

	public static void main(String[] args) {
		
		String str = "hello world";
		//logic(str);
		
		logics(str);
	}
	
	public static void logic(String s) {
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	}
	
	public static void logics(String str) {
		
		System.out.println(str.replace("world", "ALL"));
		
		System.out.println(str.split(" ")[1]  +" "+str.split(" ")[0]);
		
		String [] arr1=str.split(" ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"__");	
		}
		System.out.println();
		String [] arr2=str.split("");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"*");
		}
		System.out.println();
		
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
			for(int j=i;j<=i;j++) {
				if(j%2==0) {
				System.out.print("*");
				}else {
					System.out.print("-");
				}
			}
		}
	}
}