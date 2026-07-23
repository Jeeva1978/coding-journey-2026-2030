package day14.Arraylist1;
import java.util.ArrayList;
import java.util.Scanner;
class Exyes_no extends Exception
{
	Exyes_no(String e)
	{
		super(e);
	}
}
public class task {
	static Scanner scan = new Scanner(System.in);
	static void addtask(ArrayList<String> list)
	{
		int count = 1;
		boolean l = true;
		while(l)
		{
			try {
				System.out.print("add the task "+count+" :- ");
				list.add(scan.nextLine());
				System.out.print("if you to want to add / not(tell yes or no):- ");
				String q = scan.nextLine();
				if(!q.equals("yes") && !q.equals("no"))
				{
					throw new Exyes_no("pls try only type only the yes/no");
				}
				if(q.equals("no"))
				{
					l=false;
				}
				count = count+1;
			}
			catch(Exyes_no e)
			{
				System.out.println(e);
				list.remove(count-1);
			}
			catch(Exception e )
			{
				System.out.println("pls try again");
			}
			
		}
		System.out.println("you are successfully added the task");
	}
	static void displaytask(ArrayList<String> t)
	{
		if(t.isEmpty())
		{
			System.out.println("you have not set a task for today, please add the task");
		}
		for(int i =0 ; i<t.size();i++)
		{
			System.out.println("this all tasks of today");
			System.out.println("task "+(i+1)+" :- "+t.get(i));
		}
	}
	static void removetask(ArrayList<String> t)
	{
		try {
			System.out.print("tell which task to delete(1/2/3/4/5/6....) :- ");
			int c = scan.nextInt();
			if(t.isEmpty())
			{
				System.out.println("you have not set a task for today, please add the task");
			}
			if(c>t.size() && c<0)
			{
				System.out.println("the index is did not exists");
			}
			else
			{
				t.remove(c-1);
			}
		}
		catch(Exception e)
		{
			System.out.println(" please try again");
		}
	}
	public static void main(String[] args) {
		ArrayList<String> task = new ArrayList<>();
		try {
			boolean k = true;
			while(k)
			{
				System.out.println(" Task Manager ");
				System.out.println();
				System.out.println("1. add the task");
				System.out.println("2. remove the task");
				System.out.println("3. display all the task ");
				System.out.println("4. exists");
				System.out.println();
				System.out.print("tell the (1/2/3/4) :- ");
				int check = scan.nextInt();
				scan.nextLine();
				if(check>0 && check<5)
				{
					if(check==1)
					{
						addtask(task);
					}
					if(check==2)
					{
						removetask(task);
					}
					if(check ==3){
						displaytask(task);
					}
					if(check ==4)
					{
						k =false;
					}
				}
				else {
					throw new Exyes_no("this a menu error please try again");
				}
			}
		}
		catch(Exyes_no e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("please try again");
		}
	}

}
