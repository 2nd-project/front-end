package kosta.dao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kosta.util.DbUtil;

public class MemberDAO {
	public void member() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT MB_NAME FROM MEMBER";
		try {
				con = DbUtil.getConnection();
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString(1));
				}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
	}
}
