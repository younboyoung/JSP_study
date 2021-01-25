package com.javalec.ex.command;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.dao.BDao;
import com.javalec.ex.dto.BDto;

public class BContentCommand implements BCommand{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) {
		
		String bid = request.getParameter("bid");
		BDao dao = new BDao();
		BDto dto = dao.contentView(bid);
		
		request.setAttribute("content_view", dto);
	}
}
