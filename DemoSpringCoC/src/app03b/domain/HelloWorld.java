package app03b.domain;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	String message;
	List<String> test = new ArrayList();
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getTest() {
		return test;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}

 	
}
