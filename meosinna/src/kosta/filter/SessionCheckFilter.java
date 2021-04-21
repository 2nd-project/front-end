package kosta.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */
@WebFilter("/front")
public class SessionCheckFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String key = request.getParameter("key");
		if(key==null) {
			HttpServletRequest req = (HttpServletRequest)request; 
			HttpSession session = req.getSession();
			if(session.getAttribute("loginUser")==null) {
				req.setAttribute("errorMsg", "로그인해주세요.");
				req.getRequestDispatcher("login.jsp").forward(request, response);
				
				return;
			}
		}
		chain.doFilter(request, response);
		
		
	}


}
