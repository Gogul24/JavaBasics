package strings;

public class Stringconditions {

	public static void main(String[] args) {
		
		String str1 ="hello",str2 = "world",str3 ="Hello";
		System.out.println(str1+" "+str2);
		
		if(str1.toLowerCase().equals(str3.toLowerCase())) {
			System.out.println("str1 is equal to str3");
		}
		else {
			System.out.println("str1 is not equal to str3");
		}
		if(str1 !=null && str3 != null && str3.toLowerCase().contains(str1.toLowerCase())) {
			System.out.println("str3 contains str1");
		}
		else {
			System.out.println("str3 does not contains str1");
		}
		if(str1.equalsIgnoreCase(str3)) {
			System.out.println("str1 is equal to str3");
		}
		else {
			System.out.println("str1 is not equal to str3");
		}
	}

}
