package model.entities;

import java.util.List;

import model.dao.Daofactory;
import model.dao.Departmentdao;

public class Departmentservice {

	private Departmentdao dao = Daofactory.createdepartment();
	
	public List<Department>findall(){
		return dao.findall();
		
	}
}
