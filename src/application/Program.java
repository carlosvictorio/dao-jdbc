package application;

import java.text.ParseException;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("---- Teste 1: Find By ID ----");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
	}

}
