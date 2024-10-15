package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Marketing");
		
		Seller seller = new Seller(1, "Carlos", "Vic@gamil.com", sdf.parse("04/03/2004"), 10000.0, obj);
		System.out.println(seller);
	}

}
