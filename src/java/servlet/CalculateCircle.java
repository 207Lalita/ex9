/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author ACER
 */
@WebServlet(name = "CalculateCircle", urlPatterns = {"/CalculateCircle"})

public class CalculateCircle extends HttpServlet 
{
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String inputRadius = request.getParameter("radius");
        
        double radius = Double.parseDouble(inputRadius);
        
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
                
        String action = request.getParameter("area"); 
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>server207_CalculateCircleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if ("Area".equals(action)) {
                out.println("<h1>For the circle with radius = " + radius + " </h1>");
                out.println("<h1>area is " + area + "</h1>");
            } else if ("Perimeter".equals(action)) {
                out.println("<h1>For the circle with radius = " + radius + " </h1>");
                out.println("<h1>perimeter is " + perimeter + "</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}

