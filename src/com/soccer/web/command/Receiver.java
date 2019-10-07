package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {

	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		System.out.println("리시버 도착");
		cmd = Commander.directive(request);
	}
	
	
}
