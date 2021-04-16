package kosta.down;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downLoads")
public class DownLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. �Ѿ���� ������ �̸��� �ޱ�
		String fName = request.getParameter("fileName");
		//2. ���������� ���� ��θ� ������
		String saveDir=request.getServletContext().getRealPath("/save");
		File file = new File(saveDir, fName);
		
				
		//3. �������� �����̸��� �ش��ϴ� ������ �о 
		//Ŭ���̾�Ʈ ���������� �ٿ�ε�(���=����)
		FileInputStream  fi = new FileInputStream(file);
		ServletOutputStream so = response.getOutputStream();//Ŭ���̾�Ʈ������ ��������(�ٿ�ε�) ���(����) �غ�
		
		byte b [] = new byte [1024];
	   
		int i=0;
		while((i = fi.read(b) ) != -1){
			so.write(b);
		}
		
		so.flush();
		fi.close();
		so.close();
		
	}

}






