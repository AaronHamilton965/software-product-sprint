package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String name = request.getParameter("name-value");
    String email = request.getParameter("email-value");
    String country = request.getParameter("country-value");
    String subject = request.getParameter("subject-value");

    // Print the value so you can see it in the server logs.
    System.out.println("Submitted Name: " + name);
    System.out.println("Submitted Email: " + email);
    System.out.println("Submitted Country: " + country);
    System.out.println("Submitted Subject: " + subject);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Submitted Name: " + name);
    response.getWriter().println("Submitted Email: " + email);
    response.getWriter().println("Submitted Country: " + country);
    response.getWriter().println("Submitted Subject: " + subject);

    response.sendRedirect("https://ahamilton-sps-summer22.appspot.com/");
  }
}