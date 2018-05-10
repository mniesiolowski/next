package webzd;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        String rvnum = StringUtils.reverse(num);
        String[] tab = rvnum.split("");
        int zm = 0;
        int x = 0;

        for (int i = 0; i < tab.length; i++) {
            zm = Integer.parseInt(tab[i]);

            x += zm * (Math.pow(2, i));

        }
        response.getWriter().append(x+"");
    }
}
