package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1,"Books");
		//Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000D, obj);
		Scanner sc = new Scanner(System.in);
		
//		SellerDao sellerDao = DaoFactory.createSellerDao();
//		
//		System.out.println("### TEST 1: seller FindById #####");
//		Seller seller = sellerDao.findById(3);
//		System.out.print(seller);
//		
//		System.out.println("\n\n### TEST 2: seller FindByDepartment #####");
//		List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n\n### TEST 3: seller FindAll #####");
//		list = sellerDao.findAll();
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n\n### TEST 4: seller insert #####");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New Id: " + newSeller.getId());
//		
//		System.out.println("\n\n### TEST 5: seller update #####");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Wayne");
//		sellerDao.update(seller);
//		System.out.println("Update Completed!");
//		
//		System.out.println("\n\n### TEST 6: seller delete #####");
//		System.out.println("Enter Seller number to delete: ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		sellerDao.deleteById(id);
//		System.out.println("Delete Completed!");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("### TEST 1: department FindById #####");
		Department department = departmentDao.findById(3);
		System.out.print(department);

		List<Department> depList = new ArrayList<>();
		System.out.println("\n\n### TEST 2: department FindAll #####");
		depList = departmentDao.findAll();
		for (Department obj : depList) {
			System.out.println(obj);
		}

		
		System.out.println("\n\n### TEST 3: department insert #####");
		Department newDepartment = new Department(null, "Business Travel");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(7);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");


		sc.close();
	}
}