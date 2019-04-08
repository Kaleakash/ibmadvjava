import java.util.*;
class CollectionDemo1 {
	public static void main(String args[]) {
	//HashSet hs = new HashSet();
	//LinkedHashSet hs = new LinkedHashSet();
	TreeSet hs = new TreeSet();
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	hs.add(30);
	hs.add(30);
	//hs.add(10.10);
	hs.add(10);
	hs.add(20);	
	hs.add(40);
	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	hs.remove(20);
	System.out.println(hs);
	System.out.println("Search "+hs.contains(20));
	System.out.println("Search "+hs.contains(10));
	hs.clear();
	System.out.println(hs);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	}
}