package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/quote")
public class RandomQuote extends HttpServlet {

    public String[] quotes = {
        "I'm the one I should love in this world.", 
        "There's no need to run without even knowing the reason.", 
        "If you have moments where you feel happiness for a while, it's alright to stop", 
        "You should give you the best you.", 
        "When winter passes, spring always comes.", 
        "Our lives are long, trust yourself when in a maze.", 
        "The standards you made are more strict for yourself."};

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("Hello Aaron Hamilton!");
  }
}
