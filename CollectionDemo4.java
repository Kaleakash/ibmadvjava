import java.util.*;
class CollectionDemo4 {
	public static void main(String args[]) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println(ll.get(1));
	System.out.println(ll);
	}
}