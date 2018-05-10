package webzd;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/Servlet141")
public class Servlet141 extends HttpServlet {



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().append("<a href=\"/Servlet142?id=0\">Produkt 0</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=1\">Produkt 1</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=2\">Produkt 2</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=3\">Produkt 3</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=4\">Produkt 4</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=5\">Produkt 5</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=6\">Produkt 6</a></br>");
        response.getWriter().append("<a href=\"/Servlet142?id=7\">Produkt 7</a></br>");



    }
}