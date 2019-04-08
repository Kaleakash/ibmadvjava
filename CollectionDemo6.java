import java.util.*;
class CollectionDemo6 {
	public static void main(String args[]) {
	/*ArrayList al =new ArrayList();
	al.add(10);		//auto-boxing 
	al.add(10.10);
	al.add("Raj");
	
	Object obj = al.get(2);
	Integer i = (Integer)obj;
	int n  = i.intValue();
	System.out.println(n);*/
	//Collection framework with Generics 
	//ArrayList<Type> ll = new ArrayList<Type>();
	/*
	ArrayList<Integer> ll = new ArrayList<Integer>();
	ll.add(10);
	ll.add(30);
	ll.add(20);

	int n = ll.get(0);  //auto-unboxing : converting object to primitive 
	System.out.println(n);
	System.out.println("Using for each loop");
	for(int ii : ll) {
		System.out.println(ii);
	}
	System.out.println(ll);
	System.out.println("Using Iterator");
	Iterator li = ll.iterator();
	while(li.hasNext()) {
		System.out.println(li.next());
		//li.remove();
	}
	System.out.println(ll);*/
	
	HashMap hm = new HashMap();
	hm.put(1,"Raj");
	hm.put(2,"Ravi");
	Set ss = hm.entrySet();	//converting map to set 
	Iterator ii = ss.iterator();
	while(ii.hasNext()) {
		//System.out.println(ii.next());
		Map.Entry me = (Map.Entry)ii.next();
		System.out.println(me.getKey()+" "+me.getValue());
	}	
	}
}



