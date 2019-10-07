package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class JoinCommand extends Command{
	
	public JoinCommand(HttpServletRequest request) {
		System.out.println("조인커맨드 접속");
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		execute();
	}
	
	@Override
	public void execute() {
		System.out.println("조인커맨드 접속");
		int userCnt = PlayerServiceImpl.getInstance().join(request);
		setDomain("facade"); 
		request.setAttribute("page", (userCnt ==1) ? "login" : "fail" );
		super.execute(getDomain(),getPage());
	}
	
}
