package strings;

import java.util.HashMap;

import java.util.Map;

public class StlMap {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("Name", "GOKUL");
		map.put("Age", "22");
		map.put("Gender", "Male");
		
		System.out.println(map.get("Name"));
		System.out.println(map.get("Age"));
		System.out.println(map.get("Gender"));
		
		Map<String,Integer> map1=new HashMap<String, Integer>();
		map1.put("age", 22);
		map1.put("pincode", 641668);
		System.out.println(map1.get("pincode"));
		
		Map<Integer,Double> map2 = new HashMap<Integer, Double>();
		map2.put(0, 22.2);
		map2.put(1, 23.2);
		map2.put(2, 24.2);
		System.out.println(map2.get(2));
		
		map.keySet();
	}

}
