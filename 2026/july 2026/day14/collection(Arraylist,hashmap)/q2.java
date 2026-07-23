package day14.Arraylist1;
import java.util.*;
import java.util.Map.Entry;
public class q2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		// adding the pair
		map.put("Jeevanesh", "9677246382" );
		map.put("jestin", "1234567890");
		map.put("vishal", "7401429206");
		// for search
		if(map.containsKey("Jeevanesh"))
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("bye");
		}
		if(map.containsKey("jeevanesh"))
		{
			System.out.println("ok");
		}
		else
		{
			System.out.println("bye");
		}
		System.out.println( );
		System.out.println(map.get("Jeevanesh"));
		System.out.println(map.get("jestin"));
		System.out.println(map.get("vishal"));
		for(String i : map.keySet() )
		{
			System.out.println(map.get(i));
		}
		for(Map.Entry<String,String> e : map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		map.remove("jestin");
	}

}
