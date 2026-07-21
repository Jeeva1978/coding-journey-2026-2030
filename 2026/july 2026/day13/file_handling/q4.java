package day13.file_handling;
import java.io.BufferedReader;
import java.io.FileReader;
public class q4 {

	public static void main(String[] args) {
		try
		{
			FileReader f1 = new FileReader("output1.txt");
			BufferedReader b1 = new BufferedReader(f1);
			String line = b1.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line = b1.readLine();
			}
			b1.close();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}

}
