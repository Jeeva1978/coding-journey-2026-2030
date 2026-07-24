package project;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
class Exceptionnew extends Exception
{
	Exceptionnew(String s)
	{
		super(s);
	}
}
class Contact
{
	protected String Name;
	protected long phoneNo;
	protected String Email;
	Contact(String n,long phone_no,String Email)
	{
		Name = n;
		phoneNo = phone_no;
		this.Email=Email;
	}
}
public class ContactBook {
	static void searchContact(HashMap<String,Contact> Contacts,Scanner scan)
	{
		if(Contacts.isEmpty())
		{
			System.out.println(" The Contact book Is Empty , Please Fill The Contacts");
		}
		else
		{
			Set<String> names = Contacts.keySet();
			printline();
			System.out.println("  SEARCHING THE CONTACT");
			printline();
			System.out.println("Enter The Name You Want To Search :-");
			String name = scan.nextLine();
			if(Contacts.containsKey(name))
			{
				printline();
				System.out.println(" S.No  | Name | Phone Number | Email |");
				System.out.println(" "+1+". | "+name+" | "+Contacts.get(name).phoneNo+" | "+Contacts.get(name).Email+" |");
			}
			else
			{
				System.out.println("the contact book did not contain this name , please again");
			}
		}
	}
	static void removeContact(HashMap<String,Contact> Contacts,Scanner scan)
	{
		if(Contacts.isEmpty())
		{
			System.out.println(" The Contact book Is Empty , Please Fill The Contacts");
		}
		else
		{
			boolean j = true;
			while(j)
			{
				try {
					int error= 0;
					Set<String> names = Contacts.keySet();
					printline();
					System.out.println("  REMOVE THE CONTACT");
					printline();
					System.out.println(" The Contact To Remove It From Contact Book ");
					System.out.print(" Please Enter The Name :- ");
					String name = scan.nextLine();
					for(String i: names)
					{
						if(i.equals(name))
						{
							error=1;
						}
					}
					
					if(error ==1)
					{
						Contacts.remove(name);
						j=false;
						System.out.println("The Contact Is Removed From The Contact Book");
						printline();
						showContact(Contacts);
						printline();
					}
					else {
						j=false;
					}
				}
				catch(Exception e)
				{
					System.out.println("this is error based on the data input");
				}
			}
		}
	}
	static void updateContact(HashMap<String,Contact> Contacts,Scanner scan)
	{
		if(Contacts.isEmpty())
		{
			System.out.println(" The Contact book Is Empty , Please Fill The Contacts");
		}
		else
		{
			boolean j = true;
			while(j)
			{
				try {
					Set<String> names = Contacts.keySet();
					printline();
					System.out.println("  UPDATE THE CONTACT ");
					printline();
					System.out.println("      MENU LIST");
					printline();
					System.out.println("   1. Name ");
					System.out.println("   2. Phone Number");
					System.out.println("   3. Email");
					System.out.println("   4. Exists");
					System.out.print("Which One Would You Select (1/2/3/4) :- ");
					int Choose = scan.nextInt();
					scan.nextLine();
					printline();
					int error =0;
					if(Choose<1 || Choose>4)
					{
						throw new Exceptionnew("This Is A Error Of Invaild Input In Menu Only (1/2/3/4)");
					}
					if(Choose==1)
					{
						printline();
						System.out.print("Enter The Existing Name You Want To Update :- ");
						String name =scan.nextLine();
						printline();
						String ename = null;
						for(String i: names)
						{
							if(i.equals(name))
							{
								Contact contact = Contacts.get(i);
								System.out.print("Enter The New Name To Update :- ");
								String n = scan.nextLine();
								if(Contacts.containsKey(n))
								{
									throw new Exceptionnew("Name already exists");
								}
								else
								{
									ename=i;
									contact.Name= n;
									Contacts.put(n,contact);
									printline();
									System.out.println("Successfully added the name");
									printline();
									error =1;
								}
							}
						}
						if(error ==1)
						{
							Contacts.remove(ename);
						}
						
					}
					else if(Choose ==2)
					{
						printline();
						System.out.print("Enter The Existing Name To Search The Phone Number :- ");
						String name =scan.nextLine();
						printline();
						for(String i: names)
						{
							if(i.equals(name))
							{
								Contact contact = Contacts.get(i);
								System.out.print("Enter The Phone Number :- ");
								contact.phoneNo = scan.nextLong();
								if(contact.phoneNo>9999999999L || contact.phoneNo<1000000000L)
								{
									throw new Exceptionnew("this is invaild phone number (it should 10 digit)");
								}
								Contacts.put(i,contact);
								System.out.println("Successfully added the phone number");
								error=1;
							}
						}
						if(error ==0)
						{
							System.out.println("The Name You Enter Is Not Exists , Please Try Any");
						}
						
					}
					else if(Choose == 3)
					{
						printline();
						System.out.print("Enter The Existing Name To Search The email ID :- ");
						String name =scan.nextLine();
						printline();
						for(String i: names)
						{
							if(i.equals(name))
							{
								Contact contact = Contacts.get(i);
								System.out.print("Enter The Email ID :- ");
								contact.Email = scan.nextLine();
								if(!contact.Email.contains("@gmail.com"))
								{
									throw new Exceptionnew("the email did not contain the (@gmail.com)");
								}
								else
								{
									Contacts.put(i,contact);
									System.out.println("Successfully added the phone number");
									error =1;
								}
							}
						}
						if(error ==0)
						{
							printline();
							System.out.println("The Name You Enter Is Not Exists , Please Try Any");
							printline();
						}
					}
					else if(Choose == 4)
					{
						j = false;
					}
					else {
						throw new Exceptionnew("This Would Error In The Choose Please Fill It Correcty ");
					}
						
				}
				catch(Exceptionnew e)
				{
					System.out.println(e);
				}
				catch(Exception e)
				{
					System.out.println("this is input data/same name in contact error, please try again");
				}
			}
		}
	}
	static void showContact(HashMap<String,Contact> Contacts)
	{
		if(Contacts.isEmpty())
		{
			System.out.println(" The Contact book Is Empty , Please Fill The Contacts");
		}
		else
		{
			printline();
			System.out.println("    CONTACT  BOOK");
			printline();
			System.out.println(" S.No  | Name | Phone Number | Email |");
			int no =1;
			Set<String> names = Contacts.keySet();
			for(String i:names)
			{
				System.out.println(" "+no+". | "+i+" | "+Contacts.get(i).phoneNo+" | "+Contacts.get(i).Email+" |");
				no=no+1;
			}
		}
	}
	static void addContact(HashMap<String,Contact> Contacts,Scanner scan)
	{
		printline();
		System.out.println(" ADD CONTACTS");
		printline();
		int size=1;
		boolean f = true;
		while(f)
		{
			try {
				printline();
				System.out.println(" Contact "+size);
				System.out.print("Enter The Name :- ");
				String n = scan.nextLine();
				if (!Contacts.containsKey(n))
				{
					System.out.print("Enter The Phone Number :- ");
					long p = scan.nextLong();
					scan.nextLine();
					if(p < 1000000000L || p > 9999999999L)
					{
						throw new Exceptionnew("this is invaild phone number (it should 10 digit)");
					}
					System.out.print("Enter The Email ID :- ");
					String e = scan.nextLine();
					Contact contact = new Contact(n,p,e);
					Contacts.put(n,contact);
					size = size+1;
					System.out.print(" If You Want To Add Contact (yes/no) :- ");
					String j = scan.nextLine();
					if(!j.equals("yes") && !j.equals("no"))
					{
						Contacts.remove(n);
						size=size-1;
						throw new Exceptionnew("this is a error based on the (yes/no) input please make sure the input is same as this (yes/no) include space also ");
					}
					if(j.equals("no"))
					{
						System.out.println("All The Contacts Are Saved Successfully");
						f=false;
					}
					printline();
				}
				else
				{
					throw new Exceptionnew("the Name is already there in the contact book");
				}
			}
			catch(Exceptionnew e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e+"please refer the error code and try again ");
			}
		}
			
	}
	static void printline()
	{
		for(int i=0;i<=156;i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		HashMap<String,Contact> Contacts = new HashMap<>();
		Scanner scan = new Scanner(System.in);
			boolean finesh = true;
			while(finesh)
			{
				try {
					printline();
					System.out.println("       CONTACT BOOK   ");
					printline();
					System.out.println("         MENU LIST");
					System.out.println(" 1. Add The Contacts ");
					System.out.println(" 2. update The Contacts ");
					System.out.println(" 3. Show All The Contacts ");
					System.out.println(" 4. Remove The Contacts ");
					System.out.println(" 5. Search The Contacts ");
					System.out.println(" 6. Exist");
					printline();
					System.out.print("Which One Would You Select (1/2/3/4/5) :- ");
					int Choose = scan.nextInt();
					scan.nextLine();
					if(Choose<=0 || Choose>=7)
					{
						throw new Exceptionnew("This Is A Error Of Invaild Input In Menu Only (1/2/3/4/5)");
					}
					if(Choose==1)
					{
						addContact(Contacts,scan);
					}
					else if(Choose ==2)
					{
						updateContact(Contacts,scan);
					}
					else if(Choose == 3)
					{
						showContact(Contacts);
					}
					else if(Choose == 4)
					{
						removeContact(Contacts,scan);
					}
					else if(Choose == 5)
					{
						searchContact(Contacts,scan);
					}
					else
					{
						finesh = false;
						System.out.println("thank you !");
					}
				}
				catch(Exceptionnew e)
				{
					System.out.println(e);
				}
			}
	}
}
