package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import java.util.ArrayList;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/quote")
public class RandomQuote extends HttpServlet {

    public ArrayList<String> quotes = new ArrayList<String>() {
        {
            add("I'm the one I should love in this world.");
            add("There's no need to run without even knowing the reason.");
            add("If you have moments where you feel happiness for a while, it's alright to stop");
            add("You should give you the best you.");
            add("When winter passes, spring always comes.");
            add("Our lives are long, trust yourself when in a maze.");
            add("The standards you made are more strict for yourself.");
        }
    };

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    Gson gson = new Gson();
    String json = gson.toJson(quotes);
    response.getWriter().println(json);
  }
}
