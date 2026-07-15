package day8.static_keyword.q1;
class Class
{
	String name ;
	static int Class ;
}
public class mainclass {

	public static void main(String[] args) {
		Class c1 = new Class();
		c1.name="jeeva";// object
		Class.Class = 12;// class (static)
		Class c2 = new Class();
		c2.name ="jestin";
		Class.Class = 11; // this is the object vs class variable by the static keyword
		System.out.println("1. name :- "+c1.name);
		System.out.println("2. class :-"+Class.Class);
		System.out.println("3. name :-"+c2.name);
		System.out.println("4. class:-"+Class.Class);
	}

}
