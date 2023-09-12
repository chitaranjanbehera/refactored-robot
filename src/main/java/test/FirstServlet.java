package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")
public class FirstServlet implements Servlet {
	public void init(ServletConfig sc) throws ServletException{
		//no body
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("uname");
		String mailId=req.getParameter("mid");
		pw.println("======Dispaly=====");
		pw.println("<br>UserName:"+name);
		pw.println("<br>MialId:"+mailId);
	}
public void destroy()
{
	//no body
}
public ServletConfig getServletConfig() 
{
       return this.getServletConfig();//Demo Code
}
public String getServletInfo() {
return "FirstServlet reading data from HTMl";//Demo code
}
}
