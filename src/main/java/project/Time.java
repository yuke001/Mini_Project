package project;



import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/time")
public class Time extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String date = dateTime.format(dateFormatter);
        String time = dateTime.format(timeFormatter);

        resp.setContentType("text/html");
        resp.getWriter().print(
            "<div style='text-align: center; padding: 20px; max-width: 500px; margin: auto; font-family: Arial, sans-serif;'>"
            + "<h1>Today's Date: " + date + "</h1>"
            + "<h1>Current Time: " + time + "</h1>"
            + "<a href='/Mini_Project/' style='display: inline-block; margin: 10px; padding: 10px 20px; background-color: #3700b3; color: #fff; text-decoration: none; border-radius: 5px;'>Home</a>"
            + "</div>"
        );
    }
}
