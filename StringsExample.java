package Java8Examples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class StringsExample {
	public static void main(String args[]) throws IOException {
		System.out.println("Printing lines with characters greater than 35" ); Files.lines(Paths.get("C:\\Users\\veneela\\Desktop\\Visam Techologies\\text.txt")) 
		.filter(s -> s.length() >= 35)
		.forEach(System.out::println);
	}
}
