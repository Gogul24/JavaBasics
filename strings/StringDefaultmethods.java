package strings;

public class StringDefaultmethods {

	public static void main(String[] args) {
		String s = " Hello World";
		
		System.out.println("Length :"+s.length());
		System.out.println("Length :"+s.toCharArray().length);
		System.out.println("Relpace :"+s.replace("World","everyone"));
		System.out.println("substring :"+s.substring(0,9));
		System.out.println("Concat :"+s.concat(" Good morning"));
		System.out.println("Split :"+s.split(" ")[0]+" 2 : "+s.split(" ")[1]);
		System.out.println("Trim :"+s.trim());
		System.out.println("Index :"+s.indexOf("o"));
		System.out.println("Uppercase :"+s.toUpperCase());
		System.out.println("Lowercase :"+s.toLowerCase());
		
		int j=3;
		String s1=String.valueOf(j);
		System.out.println("equals : "+s1.equals("3"));
		
		String[] arr= s.split("");
		char[] arr1 = s.toCharArray();
		
		System.out.println("---------------------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------Split tochar array-----------------------");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}