package com.example.demojsf.view;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope("view")
public class LegacyHelloBean {

	public LegacyHelloBean() {
		System.out.println("  ***** LegacyHelloBean created!");
	}

	public String getFrom() {
		return this.toString();
	}

	public String getDate() {
		return new Date().toString();
	}
}
