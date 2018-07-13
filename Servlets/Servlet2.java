import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	ServletContext context = getServletContext();
	String str = (String) context.getAttribute("name");
	out.println("Welcome  " +str);
	out.close();
	}
}
