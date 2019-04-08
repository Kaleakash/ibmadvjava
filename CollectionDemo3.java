import java.util.*;
class CollectionDemo3 {
	public static void main(String args[]) {
	//int abc[]={10,20,30,40,50};
	ArrayList al = new ArrayList();
	al.add(10);
		al.add(20);
	al.add(30);
	al.add(40);
	System.out.println(al);
	System.out.println(al.get(1));
	al.add(1,100);
	System.out.println(al);
	System.out.println(al.get(1));
	al.remove(2);
	System.out.println(al);
	al.remove(new Integer(40));
	System.out.println(al);
	}
}