package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {

	public static Command directive(HttpServletRequest request) {
		Command cmd = new Command();
		System.out.println("커맨더 액션값 ::: " + request.getParameter("action"));
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE:  cmd = new MoveCommand(request);
			break;
		case SEARCH: cmd = new SearchCommand(request);
			break;
		case LOGIN: cmd = new LoginCommand(request);
			break;
		case JOIN: cmd = new JoinCommand(request);
		break;
		case CREATE: cmd = new CreateCommand(request);
		break;
		default :
		break;
		/*		case CREATE : new JoinCommand(request);break;
		case SEARCH : break;
		case UPDATE : break;
		case DELETE : break;
		case MOVE : break;
		*/
		
		}
		
		
		return cmd;
	}
	
	

}
