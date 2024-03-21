package strings;

public class FindingDuplicates {

	public static void main(String[] args) {
		
		String response = "";
		String s="hello World";
		for(int i=1;i<s.length();i++) {
			if(s.substring(i).contains(s.substring(i-1,i))) {
				if(!response.contains(s.substring(i-1,i))) {
					response = response.concat(s.substring(i-1,i));
				}
			}
		}System.out.println(response);
		
	}
}	

