package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class search extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] color = request.getParameterValues("color");
        String[] size = request.getParameterValues("size");
        System.out.println("These are the color families you'd like: ");
        for (String tempColor : color){
            System.out.println(tempColor);
        }
        System.out.println("and these are the sizes you'd like: ");
        for (String tempSize : size){
            System.out.println(tempSize);
        }
        System.out.println("SELECT * FROM GOWN-EXCHANGE");



        //may want to use post method for pictures? (binary data)
    }
}
