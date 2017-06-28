package ru.innopolis.ps;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pavel on 28.06.17.
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        req.setAttribute("message", "Hi!");
        String name = req.getParameter("name");
        if (name != null) {
            req.setAttribute("name", " - " + name);
        } else {
            req.setAttribute("name", " - empty");
        }
        req.getRequestDispatcher("/custom.jsp").forward(req, resp);
    }
}
