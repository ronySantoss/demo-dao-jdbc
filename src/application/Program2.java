package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
		
		System.out.println("--- Testing Insert ---");
		Department newDepartment = new Department(5, "Games");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		
	}

}
