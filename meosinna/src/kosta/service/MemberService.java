package kosta.service;

import java.sql.SQLException;

import kosta.dao.member.MemberDAO;
import kosta.dao.member.MemberDAOImpl;
import kosta.dto.Member;

public class MemberService {
	MemberDAO dao = new MemberDAOImpl();

	public void register(Member member) throws SQLException {

		int result = dao.insert(member);
		if (result == 0) {
			throw new SQLException("�벑濡앸릺吏� �븡�븯�뒿�땲�떎.");
		}
		
	public Member loginCheck(Member member) throws SQLException{
		Member dbMember = dao.loginCheck(member);
		if(dbMember == null) {
			throw new SQLException("아이디와 비밀번호를 확인해주세요");
		}
		
		return dbMember;
	}
	
		
		
}
