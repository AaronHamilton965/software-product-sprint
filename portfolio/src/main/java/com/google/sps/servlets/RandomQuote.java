package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/quote")
public class RandomQuote extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json");
    Gson gson = new Gson();
    ArrayList<String> quotes = new ArrayList<String>();
    quotes.add("I am the one I should love in this world.");
    quotes.add("There is no need to run without even knowing the reason.");
    quotes.add("If you have moments where you feel happiness for a while, it is alright to stop.");
    quotes.add("You should give you the best you.");
    quotes.add("When winter passes, spring always comes.");
    quotes.add("Our lives are long, trust yourself when in a maze.");
    quotes.add("The standards you made are more strict for yourself.");
    System.out.println(quotes);

    Random random_method = new Random();
    int index = random_method.nextInt(quotes.size());
    String randomQuote = quotes.get(index);
    String json = gson.toJson(randomQuote);
    response.getWriter().println(json);
    System.out.println(json);
  }
}
