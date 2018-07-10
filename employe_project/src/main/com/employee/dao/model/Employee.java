package employee.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "employee_details")
public class Employee implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7528587800563696190L;
	private int empId;
	@Id
	 public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
@Column(name="emp_name")
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Column(name="emp_salary")
	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	private String empName;
	 private int empSalary;
	 
	 //No Argument constructer
	 public Employee(){
		 
	 }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}
	 
	 
	 

}



// encapsulation 
// Serializable  --> 
