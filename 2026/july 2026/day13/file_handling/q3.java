package day13.file_handling;
import java.io.FileReader;
public class q3 {

	public static void main(String[] args) {
		try
		{
			FileReader f1 = new FileReader("output1.txt");
			int cha = f1.read();
			while(cha!=-1)
			{
				System.out.print((char)cha);
				cha=f1.read();
			}
			f1.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
