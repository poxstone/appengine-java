<!DOCTYPE html>
<%@page import="com.poxstone.SampleServlet"%>
<html>
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Hello App Engine</title>
  </head>

  <body>
    <h1>Hello App Engine!</h1>
    <p>
	    <b>Available Servlets: (<%= request.getHeader("User-Agent") %>)</b>
	    <br>
	    <a href="<%= SampleServlet.URL + "?" + SampleServlet.PARAM + "=hola" %>">send Hola</a>
    </p>
    <ul>
    	<li><b>Java expresions &lt;%=</b>
		    <ul>
			    <li>String System date (Date) = <%= new java.util.Date() %></li>
				<li>String uppercase (Date) = <%= new String("Juan").toUpperCase() %></li>
			    <li>Operation (5 + 7) = <%= 5 + 7 %></li>
			    <li>Boolean (10 &lt; 100) = <%= 10 < 100 %></li>
		    </ul>
	    </li>
	    <li><b>Java scriptlet &gt;%</b>
	        <ul>
		    	<% 
	    	    for (int i=0;i<5;i++) {
	    	    	out.println("<li> linea = " + i + "</i>");
	    	    }
		    	 %>
	    	</ul>
	    </li>
	    <li><b>Java declaration &gt;%!</b>
	        <%!
	        private int resultado;
	        public int suma(int num1, int num2) {
	            resultado = num1 + num2;
	        	return num1 + num2;
	        }
	        %>
	        <ul>
	        	<li>metodo suma(7 + 7) = <%= suma(7,7) %></li>
	        	<li>Imprimir resultado = <%= resultado %></li>
	        </ul>
	    </li>
    </ul>
    
  </body>
</html>