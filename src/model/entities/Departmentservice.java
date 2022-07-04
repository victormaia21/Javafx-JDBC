package model.entities;

import java.util.ArrayList;
import java.util.List;

import gui.entities.Department;

public class Departmentservice {

	public List<Department>findall(){
		List<Department>list = new ArrayList<>();
		list.add(new Department("Books", 1));
		list.add(new Department("Computers", 2));
		return list;
	}
}
