package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1,"Books");
		//Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000D, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("### TEST 1: seller FindById #####");
		Seller seller = sellerDao.findById(3);
		System.out.print(seller);
		
		System.out.println("\n\n### TEST 2: seller FindByDepartment #####");
		List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n### TEST 3: seller FindAll #####");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n### TEST 4: seller insert #####");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id: " + newSeller.getId());
		
		System.out.println("\n\n### TEST 5: seller update #####");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
	}
}