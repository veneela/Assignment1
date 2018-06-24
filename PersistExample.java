package visam.com.Assignment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;


public class PersistExample {

	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\veneela\\Desktop\\Visam Techologies\\empserialize.txt"); 
		FileOutputStream fos = new FileOutputStream(f);
		FilterOutputStream os = new FilterOutputStream(fos);
		FileInputStream fs = new FileInputStream(f);
		FilterInputStream fis = new BufferedInputStream(fs); 
        String st = "this is filter input and output example";
        byte s[]=st.getBytes();      
        os.write(s);
        os.flush();
        int k =0;  
        while((k=fis.read())!=-1){  
            System.out.print((char)k);  
        }  
        os.close();  
        fos.close(); 
        fis.close();
        System.out.println("\n success...");
	}
}
  

