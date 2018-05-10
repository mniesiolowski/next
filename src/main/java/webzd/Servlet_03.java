package webzd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet_03")
public class Servlet_03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String age = request.getParameter("age");
        List<String> list = new ArrayList<>();
        list.add(firstName); list.add(lastName);
        HttpSession sess = request.getSession();


            List<String> newList = (List<String>) sess.getAttribute("daneList");
           sess.setAttribute("daneList",newList);
            response.getWriter().append(newList + "");




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        pw.append("<form method='post'>");
        pw.append("<input type='text' name='firstName'/>Imie<br/>");
        pw.append("<input type='text' name='lastName'/>Nazwisko<br/>");
        pw.append("<input type='text' name='age'/>wiek<br/>");
        pw.append("<input type='submit'/>");
        pw.append("</form>");
    }
}
