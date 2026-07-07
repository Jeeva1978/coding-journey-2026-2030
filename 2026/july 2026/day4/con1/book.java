package day3.constructor.con1;

public class book {
	String title ="not entered" ;
	String author = "not entered";
	double price = 0.0 ;
	void printline()
	{
		for(int u = 0;u<=156;u++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	book(String t, String a,double p)
	{
		title = t;
		author = a;
		price = p;
	}
	book(String t, String a)
	{
		title = t;
		author = a;
	}
	book(String t)
	{
		title = t;
	}	
	book()
	{
		title ="not entered" ;
		author = "not entered";
		price = 0.0 ;
	}
	void get_detail()
	{
		printline();
		System.out.println("if you see 0.0 or not entered means the data is not entered in database");
		printline();
		System.out.println();
		printline();
		System.out.println("This is the book name :- "+title);
		System.out.println("Author :- "+author);
		System.out.println("price:- "+price);
		printline();
	}
	public static void main(String[] args) {
		book book1 = new book("book of kestin","jestin y",10000);
		book book2 = new book("war of god","jeeva");
		book book3 = new book("love with thirak");
		book book4 = new book();
		book1.get_detail();
		book2.get_detail();
		book3.get_detail();
		book4.get_detail();
	}

}
