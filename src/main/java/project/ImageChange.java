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

@WebServlet("/image")
public class ImageChange extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	// List of random funny cat, dog, and animal image URLs
    	List<String> images = Arrays.asList(
    	    // Cats
    	    "https://placekitten.com/500/500",
    	    "https://cataas.com/cat",
    	    "https://placekitten.com/600/400",
    	    "https://cataas.com/cat/cute",
    	    
    	    // Funny Cats
    	    "https://cataas.com/cat/funny",
    	    "https://cataas.com/cat/cute/says/Hi",
    	    "https://cataas.com/cat/cute/says/Meow",
    	    
    	    // Dogs
    	    "https://placedog.net/500/500",
    	    "https://placedog.net/600/400",
    	    
    	    // Funny Animals
    	    "https://loremflickr.com/500/500/funny,animal",
    	    "https://loremflickr.com/600/400/funny,animal",
    	    
    	    // Other Animal Placeholders
    	    "https://placebear.com/500/500",      // Bears
    	    "https://placebear.com/600/400",
    	    "https://loremflickr.com/500/500/dog",
    	    "https://loremflickr.com/600/400/cat",
    	    "https://loremflickr.com/500/500/dog,cat"
    	);
    	
      
        String imageUrl = images.get(new Random().nextInt(images.size()));

        // Set content type to text/html
        resp.setContentType("text/html");

        // Output HTML with styling for the image and buttons
        resp.getWriter().print("<html><head><style>"
                + "body { display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; font-family: Arial, sans-serif; background-color: #f0f0f0; }"
                + ".container { text-align: center; }"
                + "img { border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); margin-bottom: 20px; }"
                + ".btn { padding: 10px 20px; font-size: 16px; background-color: #6200ea; color: #fff; text-decoration: none; border: none; border-radius: 4px; cursor: pointer; transition: background-color 0.3s ease; margin: 5px; }"
                + ".btn:hover { background-color: #3700b3; }"
                + "</style></head><body>"
                + "<div class='container'>"
                + "<img src='" + imageUrl + "' alt='Random Cat Image' width='500' height='500'/>"
                + "<br>"
                + "<button class='btn'><a href='/Mini_Project/image' class='btn'>Change Image</a></button>"
                + "<button class='btn'><a href='/Mini_Project/' class='btn'>Home</a></button>"
                + "</div></body></html>");
    }
}
