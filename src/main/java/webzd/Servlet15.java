package webzd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random r = new Random();

       List<Integer> lista = new ArrayList<>();

        for(int i=0;i<10;i++){
            int random= r.nextInt(100)+1;
            lista.add(random);

        }
        response.getWriter().append(lista+"");
        Collections.sort(lista);
        response.getWriter().append(lista+ "");
    }
}
