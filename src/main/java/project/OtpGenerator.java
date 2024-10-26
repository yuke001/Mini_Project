package project ;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otp")
public class OtpGenerator extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int otp = new Random().nextInt(900000) + 100000; // 6-digit OTP

        resp.setContentType("text/html");
        resp.getWriter().print(
            "<div style='text-align: center; padding: 20px; max-width: 500px; margin: auto; font-family: Arial, sans-serif;'>"
            + "<h1>Your OTP is: " + otp + "</h1>"
            + "<a href='/Mini_Project/otp' style='display: inline-block; margin: 10px; padding: 10px 20px; background-color: #6200ea; color: #fff; text-decoration: none; border-radius: 5px;'>Change OTP</a>"
            + "<a href='/Mini_Project/' style='display: inline-block; margin: 10px; padding: 10px 20px; background-color: #3700b3; color: #fff; text-decoration: none; border-radius: 5px;'>Home</a>"
            + "</div>"
        );
    }
}
