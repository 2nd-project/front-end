package kosta.dao.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import kosta.dto.CartDTO;
import kosta.dto.Goods;
import kosta.dto.SizeDTO;
import kosta.util.DbUtil;

public class CartDAOImpl implements CartDAO {

	@Override
	public List<CartDTO> viewCart() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}
	/** @author Lee SeungHyun
	 * 
	 *  장바구니 TABLE에 하나의 레이블로 추가될 값들은 single-product.html에서 선택된 값들을 가져와야 한다.
	 *  그렇다면 과연 어떤 scope에(request / session / application) 선택된 값들을 저장할 것이며
	 *  어떻게 가져오는가?
	 *  그리고 DAO객체와 어떻게 연결지을 것인가?
	 * 
	 */
	@Override
	public int addToCart(Goods goods , SizeDTO sizeDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		String sql="INSERT INTO CART VALUES(?,?,?,?,?,?)";
		int result = 0;
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, goods.getGdCode());
			ps.setString(2, goods.getGdName());
			ps.setInt(3, sizeDTO.getSize());
			ps.setInt(4, goods.getPrice());
			ps.setInt(5, goods.getQty());
			// ps.setInt(6, ) -> 회원코드는 MemberDTO에서 가져와야 하는지?
			
		} finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int delete() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
