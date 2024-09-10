package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String postThis(Employee e) {
	er.save(e);
	return "POSTED SUCCESSFULLY";
}
public List<Employee> getAll() {
	return er.findAll();
}
public String postAll(List<Employee> a) {
	er.saveAll(a);
	return " login successfully";
}
public List<Employee>maxSalary() {
	return er.findAll();
}
public Employee getId(int a) {
	return er.findById(a).get();
}
public String getIds(int a) {
	er.deleteById(a);
	return "Successfully deleted";
}
public List<Employee>midAge() {
	return er.findAll();
}
}
