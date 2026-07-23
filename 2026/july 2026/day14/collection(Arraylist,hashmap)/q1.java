package day14.Arraylist1;
import java.util.ArrayList;
import java.util.Collections;
public class q1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// adding the elements
		list.add("jeevanesh");
		list.add("jestin");
		list.add("vishal");
		System.out.println(list);
		// to get the element
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		// to insert the element butwen
		list.add(0,"risthish");
		list.add(2,"thiakal");
		System.out.println(list);
		// to set a element in same place
		list.set(1,"jeeva");
		list.set(4, "vigneshwaran");
		System.out.println(list);
		// to remove the elements
		list.remove(2);
		System.out.println(list);
		// to get the size
		System.out.println(list.size());
		// to loop in list
		for(String i: list )
		{
			System.out.println(i);
		}
		for(int i =0 ; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		// to set in sorting 
		Collections.sort(list);
		System.out.println(list);
	}
	private static void add(int i) {
		// TODO Auto-generated method stub
		
	}
	private static void add(String string) {
		// TODO Auto-generated method stub
		
	}

}
