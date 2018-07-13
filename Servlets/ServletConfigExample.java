import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet {
	public void doGet(HttpServletRequest Req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		context.setAttribute("name","teja");
		out.println("This is first Servlet");
		out.println("<a href='servlet2'> visit </a>");
		out.print("servlet name:"+config.getServletName());
		out.print("servlet context name:"+context.getClassLoader());
		out.print("servlet class:"+context.getContextPath());
		out.print("servlet init parameter:"+context.getInitParameter("name"));
		out.print("servlet config init param:"+config.getInitParameter("name"));
		out.close();
		}
}
