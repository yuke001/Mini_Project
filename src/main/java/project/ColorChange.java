package project;



import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/color")
public class ColorChange extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> colors = Arrays.asList("red", "blue", "yellow", "green", "pink", "orange", "purple");
        String color = colors.get(new Random().nextInt(colors.size()));

        resp.setContentType("text/html");
        resp.getWriter().print(
            "<div style='text-align: center; padding: 20px; max-width: 500px; margin: auto; font-family: Arial, sans-serif;'>"
            + "<h1>Random Color</h1>"
            + "<div style='background-color:" + color + "; width: 300px; height: 300px; margin: 20px auto;'></div>"
            + "<a href='/Mini_Project/color' style='display: inline-block; margin: 10px; padding: 10px 20px; background-color: #6200ea; color: #fff; text-decoration: none; border-radius: 5px;'>Change Color</a>"
            + "<a href='/Mini_Project/' style='display: inline-block; margin: 10px; padding: 10px 20px; background-color: #3700b3; color: #fff; text-decoration: none; border-radius: 5px;'>Home</a>"
            + "</div>"
        );
    }
}
