package webzd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            Integer set = Integer.parseInt(request.getParameter("massage"));
            String  wal = request.getParameter("food");
            Map<String,Integer> list = new HashMap<>();
            list.put("EUR-USD",2);
            list.put("USD-EUR",4);
            list.put("EUR-PLN",8);
            int a = list.get(wal);

            int nowa = set*a;
            response.getWriter().append(nowa+"");

            }

    }

