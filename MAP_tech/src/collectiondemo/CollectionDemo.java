package collectiondemo;

import java.util.*;
public class CollectionDemo {
	private Collection<String> collectionobj;
	public CollectionDemo()
	{
		collectionobj=new ArrayList<String>();
		collectionobj.add("Computer");
		collectionobj.add("java");
		collectionobj.add("Mouse");
		collectionobj.add("Laptop");
		
		Iterator<String> iter=collectionobj.iterator();
		while(iter.hasNext())//it will check is there more elements available
		{
			System.out.println("Elements are "+iter.next());
		}
		collectionobj.remove("Mouse");
		iter=collectionobj.iterator();
		while(iter.hasNext())//it will check is there more elements available
		{
			System.out.println("Elements after updates are  "+iter.next());
		}
		if(collectionobj.contains("java"))
		{
			System.out.println("Items available");
		}
		Collections.addAll(collectionobj, "C++","Python");
		iter =collectionobj.iterator();
		while(iter.hasNext()) {
			System.out.println(" using add all method " +iter.next());
		}
		collectionobj.removeAll(collectionobj);
		iter =collectionobj.iterator();
		boolean val = iter.hasNext();
		System.out.println(val);

		
	}
	public static void main(String[] args) {
		CollectionDemo cdemo=new CollectionDemo();
		
	}
	

}