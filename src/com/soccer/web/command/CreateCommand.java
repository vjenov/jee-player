package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class CreateCommand extends Command{

	public CreateCommand(HttpServletRequest request) {
			setRequest(request);
			setAction(request.getParameter("action"));
			setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
			setPage(request.getParameter("page"));
			System.out.println("create커맨드 도착" + request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
			System.out.println("create page값" + request.getParameter("page"));
	        execute(getDomain(),getPage());
	}
	
	@Override
	public void execute() {
		System.out.println("create커맨드 도착" + request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		System.out.println("create page값" + request.getParameter("page"));
        super.execute(getDomain(), getPage());
	}
	
}
