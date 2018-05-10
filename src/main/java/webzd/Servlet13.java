package webzd;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {
    File file = new File("/home/marcin/Pulpit/Projekty/oop.txt");

    Scanner s;

    {
        try {
            s = new Scanner(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        while (s.hasNextLine()) {
            String line = s.nextLine();
            response.getWriter().append(line + "\n");
        }
    }
}
