package app03b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import app03b.domain.HelloWorld;

/**
 * Servlet implementation class HelloWorldServlet
 */
 
public class HelloWorldController  extends AbstractController {
	 
	HelloWorld helloWorld;
	
	public ModelAndView handleRequestInternal (HttpServletRequest request,
 			HttpServletResponse response) {
		
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setTest(null) ;
		
//		System.out.printf("SIZE = %d", helloWorld.getTest().size());
		helloWorld.setMessage(" You're the BEST!!!!");
		
		return new ModelAndView("/HelloWorld.jsp","hello",helloWorld);
	}

}
