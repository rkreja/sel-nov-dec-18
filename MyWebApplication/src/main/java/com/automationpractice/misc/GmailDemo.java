package com.automationpractice.misc;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rkreja.EmailClient;
import com.rkreja.Gmail;

public class GmailDemo {
	
	
	
	
	@Test
	public void otherEmail() {
		EmailClient email = new EmailClient("info@timeandtraining.net", "uid", "pwd", "incomingserveraddress", "outgoingserveraddress", 485);
		email.get_most_recent_email();
	}
	
	

	@Test
	public void composeEmail() {
		Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
		gmail.ComposeEmail("timentrainingstudent@gmail.com", "Hello from Java", "test msg");
		//gmail.check_todays_email_in_inbox("timentrainingstudent@gmail.com", "test case one", "test");
		
	}
	
	@Test
	public void readEmail() {
		Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
		String email=gmail.get_most_recent_email();
		Assert.assertEquals(email.contains("test msg"), true);
		
		
	}
	
	

}
