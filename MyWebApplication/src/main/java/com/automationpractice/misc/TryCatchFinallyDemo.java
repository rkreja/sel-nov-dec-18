package com.automationpractice.misc;

import org.testng.annotations.Test;

public class TryCatchFinallyDemo {
	

	
	
@Test	
public void tcf() {
	try {
		
	System.err.println("open browser");
	System.err.println("navigate to the web app");
	System.err.println("register a user with userid 'rkreja'");
	System.err.println("login with user: rkreja");
	
	
	System.err.println(0/1);
		
	} catch (Exception e) {
		System.err.println("ERROR FOUND "+ e.getMessage());
	}finally {
		System.err.println("logout");
		System.err.println("delete the user: rkreja");
	}
	
	
}
	

}
