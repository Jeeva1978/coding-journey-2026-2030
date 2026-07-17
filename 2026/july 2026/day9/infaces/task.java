package day9.multiple_inhertance.interface1;
interface readable
{
	void read();
}
interface Wirteable
{
	void write();
}
interface storable
{
	void store();
}
class file implements readable,Wirteable,storable
{
	public void read()
	{
		System.out.println(" file readed ");
	}
	public void write()
	{
		System.out.println(" file writeable ");
	}
	public void store()
	{
		System.out.println(" file storeable ");
	}
}
public class task {
	public static void main(String[] args)
	{
		file f1 = new file();
		f1.read();
		f1.write();
		f1.store();
	}
}
