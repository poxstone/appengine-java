package com.poxstone;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class SampleServlet {

  @Test
  public void test() throws IOException {
      
    MockHttpServletResponse response = new MockHttpServletResponse();
    new HelloAppEngine().doGet(null, response);
    Assert.assertEquals("text/html", response.getContentType());
    Assert.assertEquals("UTF-8", response.getCharacterEncoding());
    Assert.assertEquals("Hello App Engine!none", response.getWriterContent().toString());
    //Assert.assertEquals("","");
  }
}
