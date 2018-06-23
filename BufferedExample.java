package visam.com.Assignment;
import java.io.*;
public class BufferedExample {
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("C:\\Users\\veneela\\Desktop\\Visam Techologies\\bwriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("this is first program in Streams");
		bw.close();
		System.out.println("data written successfully");
	}

}
