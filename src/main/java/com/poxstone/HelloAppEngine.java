package com.poxstone;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  private static final long serialVersionUID = 1L;

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    String obtainParam = "none";

    // when get not retrieves parameters
    try {
	obtainParam = request.getParameter("sendNumber");
    } catch(NullPointerException e) {
	System.out.print("fail in post");
    }
    
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().append("Hello App Engine!").append(obtainParam);

  }
}
