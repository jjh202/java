package D0926;
import java.io.*;

public class FileIOTest1 {
	public static void main(String[] args) throws Exception {
		String source = "Have a good day. Hava a nice day! Have good? Have fun?";
		char[] intxt = new char[source.length()];
		source.getChars(0, source.length(), intxt, 0);
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt);
		
		fw.close();

	}
}
