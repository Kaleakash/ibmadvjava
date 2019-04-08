import java.util.*;
class CollectionDemo5 {
	public static void main(String args[]) {
	HashMap hm = new HashMap();
	//LinkedHashMap hm = new LinkedHashMap();
	//TreeMap hm = new TreeMap();
	hm.put(2,"Ravi");
	hm.put(4,"Raj");
	hm.put(3,"Ramesh");
	hm.put("abc","Ramu");
	System.out.println(hm);
	hm.put(1,"Ajay");
	hm.put(5,"Ravi");
	System.out.println(hm);
	hm.remove(4,"Raj");
	System.out.println(hm);
	}
}