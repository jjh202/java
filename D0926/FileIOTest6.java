package D0926;
import java.io.*;

public class FileIOTest6 {
	public static void main(String[] args) throws Exception {
		int[] num = {1,2,3,4,5};
		String[] st = {"Kim","Park","Jung","Lee"};
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.txt"));
		oos.writeObject(num);
		oos.writeObject(st);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tmp.txt"));
		int[] num2 = (int[]) ois.readObject();
		String[] st2 = (String[]) ois.readObject();
		for (int i=0; i < num2.length; i++)
			System.out.print(num2[i] + " ");
			System.out.println();
		for (int i=0; i < st2.length; i++)
			System.out.print(st2[i] + " ");	
	}
}
