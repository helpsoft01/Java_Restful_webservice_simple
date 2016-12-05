package sonvh.webservice.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sonvh.webservice.entity.Employee;
import sonvh.webservice.entity.Employees;

@Path("/hello")
public class Hello {

	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployees() {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee(1, "Mot"));
		l.add(new Employee(2, "Hai"));

		Employees lem = new Employees();
		lem.setEmployeeList(l);
		return lem.getEmployeeList();// userDao.getAllUsers();
	}
}
