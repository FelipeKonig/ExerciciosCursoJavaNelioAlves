package Repository;

import java.util.ArrayList;
import java.util.List;

import Entities.Employee;

public class EmployeeDB {

	private List<Employee> listEmployee = new ArrayList<>();

	public void updateEmployee(Employee employee) {
		for (Employee employee2 : listEmployee) {
			if (employee2.getId() == employee.getId()) {
				employee2 = employee;
			}
		}
	}

	public Employee getEmployee(int id) {
		return listEmployee.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}
}
