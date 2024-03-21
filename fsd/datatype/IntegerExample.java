package fsd.datatype;

public class IntegerExample {

	public static void main(String[] args) {
		Integer age = new Integer(77);
		Integer age1 =77;
		String pincode = "641668";
		Integer pin = Integer.parseInt(pincode);
		String agestr = age1.toString();
		System.out.println(age1.max(21, 17));
		System.out.println(age1.min(21,17));
		System.out.println(Integer.sum(21, 17));
		
		Double d = new Double(21.6);
		Double d1 = 32.9;
		System.out.println(Double.parseDouble(agestr));
		System.out.println(Double.sum(21.3, 12.5));
		String dstr = d.toString();
		System.out.println(dstr);

	}

}
