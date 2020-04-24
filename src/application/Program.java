package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1,"Books");
		//Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000D, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("### TEST 1: seller FindById #####");
		Seller seller = sellerDao.findById(3);
		System.out.print(seller);
	}
}