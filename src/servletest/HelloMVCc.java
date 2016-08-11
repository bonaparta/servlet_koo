package servletest;

//use http://localhost:8080/[project name]/hello.do?user=momor to test

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HelloMVCServlet", urlPatterns={"/hello.do"})
public class HelloMVCc extends HttpServlet {
    private HelloMmVC hello = new HelloMmVC();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("user");
        String message = hello.doHello(name);
        req.setAttribute("message", message);
        req.getRequestDispatcher("HelloMVvC.jsp").forward(req, resp);
    }
}