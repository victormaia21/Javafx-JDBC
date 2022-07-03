package gui.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Name;
	private int Id;
	
	public Department() {
	}

	public Department(String name, int id) {
		Name = name;
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Id == other.Id && Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "Department [Name=" + Name + ", Id=" + Id + "]";
	}
	
	

}
