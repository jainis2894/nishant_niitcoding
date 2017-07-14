import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet
{
public void init()
{
}
public void doGet(HttpServletRequest req,HttpServletResponse res) 
{
try{
 res.setContentType("text/html");
PrintWriter pw=res.getWriter();
pw.println("<html>");
pw.println("<h1>nishant</h1>");
pw.println("</html>");
}
catch(Exception e)
{
System.out.println(e);
}

}
public void destroy()
{
}   

}