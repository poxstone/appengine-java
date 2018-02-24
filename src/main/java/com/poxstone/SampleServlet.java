package com.poxstone;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "SampleServlet",
    urlPatterns = {"/helloServlet"}
)
public class SampleServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    String obtainParam = "none";

    // On Test launch not pass through here
    try {
	obtainParam = request.getParameter("sendString");
	obtainParam = obtainParam  == null ? obtainParam : "none"; 
    } catch(NullPointerException e) {
	System.out.print("fail in post");
    }
    
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().append("Hello Servlet appEngine!").append(obtainParam);

  }
}
