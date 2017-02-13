package com.poc.bhupi;

public class Sample {

	String message = "foo";

	  public String foo() {
	    return message;
	  }

	  public void uncoveredMethod() {
	    System.out.println(foo());
	  }

}
