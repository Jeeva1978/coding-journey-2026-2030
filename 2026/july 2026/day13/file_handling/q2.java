package day13.file_handling;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class q2 {

	public static void main(String[] args) {
		try
		{
			FileWriter f1 = new FileWriter("output1.txt",true);
			BufferedWriter b1 = new BufferedWriter(f1);
			b1.write("jeevaneshwaran is the good person the man who can build the story but it can be the man of itself");
			b1.newLine();
			b1.write("jestin is the main function atti and the risthis the main soucre of the team iam 11th standard man who stands for the responesd detail main mean for you that it would help for me and this a file write handling for java elicpes");
			b1.newLine();
			int j = 23;
			b1.write(j);
			b1.close();
		}
		catch(Exception e)
		{
			System.out.println("this error ! while writing.");
		}
	}

}
