package com.poxstone;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class SampleServletTest {

  @Test
  public void test() throws IOException {
      
    MockHttpServletResponse response = new MockHttpServletResponse();
    new SampleServlet().doGet(null, response);
    Assert.assertEquals("text/html", response.getContentType());
    Assert.assertEquals("UTF-8", response.getCharacterEncoding());
    Assert.assertEquals("Hello Servlet appEngine!none", response.getWriterContent().toString());
    //Assert.assertEquals("","");
  }
}
