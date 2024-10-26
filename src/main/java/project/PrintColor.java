package project;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintColor extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");

        resp.setContentType("text/html");
        resp.getWriter().print(
            "<div style='background-color:" + color + "; width: 100vw; height: 100vh; display: flex; justify-content: center; align-items: center; font-family: Arial, sans-serif;'>"
            + "<h1 style='color: #fff;'>Background Color: " + color + "</h1>"
            + "</div>"
        );
    }
}
