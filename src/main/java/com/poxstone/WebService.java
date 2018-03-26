package com.poxstone;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
import com.google.appengine.api.datastore.QueryResultIterator;

@WebServlet(
    name = "WebService",
    urlPatterns = {"/webservice"}
)
public class WebService extends HttpServlet {

  private static final long serialVersionUID = 1L;
  public static final String URL = "helloServlet";
  public static final String PARAM = "sendString";
  
  /*Datastore*/
  private DatastoreService datastore;
  private static final String BOOK_KIND = "Book2";

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    String obtainParam = "none";

    // On Test launch not pass through here
    try {
	obtainParam = request.getParameter(SampleServlet.PARAM);
	obtainParam = obtainParam  != null ? obtainParam : "none"; 
    } catch(NullPointerException e) {	System.out.print("fail in post");
    }
    
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().append("Hello Servlet appEngine!").append(obtainParam);
    //addTask("primera");
    //System.out.println("task added");

  }
}
