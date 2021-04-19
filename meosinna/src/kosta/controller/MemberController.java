package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.dao.member.MemberDAOImpl;
import kosta.dto.Member;
import kosta.service.MemberService;


public class MemberController implements Controller {
	private MemberService memberService = new MemberService();
	

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		return null;
	}
	
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		HttpSession session = request.getSession();
		String mbName = (String)request.getParameter("name");
		String id =  (String)request.getParameter("id");
		String pwd =  (String)request.getParameter("password");
		String confimrPwd = (String)request.getParameter("confirmPassword");
		String email =  (String)request.getParameter("confirmPassword");
		String addr1 =  (String)request.getParameter("address");
		String addr2 =  (String)request.getParameter("addressDetail");		
		String jumin =  (String)request.getParameter("jumin");
		String tel =  (String)request.getParameter("phone");
		String address = addr1 + addr2;
		
		
		//유효성 체크 
		//pwd confirmPwd 매치 확인 필요
		Member member = new Member(mbName, id, pwd, email, address, jumin, tel); 
		
		memberService.register(member);
		session.setAttribute("member", member);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}


	
}
