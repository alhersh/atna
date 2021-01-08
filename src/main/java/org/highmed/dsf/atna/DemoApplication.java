package org.highmed.dsf.atna;

import org.highmed.dsf.atna.message.AuditMessage;
import org.highmed.dsf.atna.message.EventIdentificationContents;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String [] StErr = new String [3];
		StErr[0]= "Code 1";
		StErr[0]= "Code 2";
		StErr[0]= "Code 3";
		SpringApplication.run(DemoApplication.class, args);
		AuditMessage message = new AuditMessage();
		EventIdentificationContents content = new EventIdentificationContents();
		content.setEventActionCode("Action code 1");
		message.setEventIdentification(content);
		message.setEventIdentification(content);
		
	}

}
