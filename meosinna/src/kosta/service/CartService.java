package kosta.service;

import java.sql.SQLException;

import kosta.dto.Goods;

public interface CartService {
	public void addToCart(Goods goods, int qty, int mbCode) throws SQLException;
}
