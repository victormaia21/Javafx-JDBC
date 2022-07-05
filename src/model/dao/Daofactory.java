package model.dao;

import db.DB;
import model.dao.impl.DepartmentdaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class Daofactory {
	
	public static Sellerdao createseller() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static Departmentdao createdepartment() {
		return new DepartmentdaoJDBC(DB.getConnection());
	}
}
