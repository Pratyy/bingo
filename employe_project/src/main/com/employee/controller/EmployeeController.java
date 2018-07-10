package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import employee.controller.request.EmployeeRequest;
import employee.dao.EmployeeDao;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao employeedao;
	@RequestMapping(value= "/addEmployee", method= RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeRequest empReq){
		System.out.println("hIII");
		employeedao.addEmployee(empReq);
		
	}

}
