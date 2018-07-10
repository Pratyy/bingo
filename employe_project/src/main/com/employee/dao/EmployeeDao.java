package employee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import employee.controller.request.EmployeeRequest;
import employee.dao.model.Employee;

public class EmployeeDao {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.getCurrentSession();
	
	public void addEmployee(EmployeeRequest empReq  ){
		Employee emp  = new Employee();   // entity
		emp.setEmpName(empReq.getEmpName());
		emp.setEmpSalary(empReq.getEmpSalary());
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		
	}

}
