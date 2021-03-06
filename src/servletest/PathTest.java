package servletest;

// use http://localhost:8080/[project name]/servlet/path.view to test
// use http://localhost:8080/[project name]/servlet/* to test
// use http://localhost:8080/[project name]/servlet/ to test
// use http://localhost:8080/[project name]/servlet to test

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name="Path", urlPatterns={"/servlet/*"})
public class PathTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
                PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("    <head>");
        out.println("        <title>Servlet ShowHeader</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println(        req.getRequestURI() + "<br>");
        out.println(        req.getContextPath() + "<br>");
        out.println(        req.getServletPath() + "<br>");
        out.println(        req.getPathInfo());
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}