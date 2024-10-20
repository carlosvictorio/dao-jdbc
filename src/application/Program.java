package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("---- Teste 1: Find By ID ----");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println("\n----Teste 2: seller findByDepartment ----");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n----Teste 3: seller findAll ----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n----Teste 4: seller Insert ----");
		Department department2 = new Department(3, null);
		Seller newSeller = new Seller(null, "Valdete", "val@gmail,com", sdf.parse("18/04/1979"), 5000.0, department2);
		sellerDao.insert(newSeller);
		System.out.println("id: " + newSeller.getId());
	}

}
