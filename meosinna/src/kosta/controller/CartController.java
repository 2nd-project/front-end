package kosta.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta.dto.Goods;
import kosta.dto.Member;
import kosta.service.CartServiceImpl;

public class CartController implements Controller {
	CartServiceImpl service = new CartServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return null;
	}
	
	public ModelAndView addToCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException, SQLException {
		HttpSession session = request.getSession();
		Goods goods = (Goods)session.getAttribute("goods");
		String qty = request.getParameter("qty");
		Member member = (Member)session.getAttribute("member");
		
		service.addToCart(goods, Integer.parseInt(qty), member.getMbCode());
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
