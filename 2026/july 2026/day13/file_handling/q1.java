package day13.file_handling;
import java.io.FileWriter;
public class q1 {

	public static void main(String[] args) {
		try
		{
			FileWriter F1 = new FileWriter("output.txt",true);
			FileWriter F2 = new FileWriter("output.txt");
			F1.write("hi iam jeeva");
			F1.write(" b tech cse core");
			F1.close();
			F2.write("hi iam janani");
			F2.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println("this a error in the write the file");
		}

	}

}
