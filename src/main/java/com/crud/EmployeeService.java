package com.crud;

//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String postThis(Employee e) {
	return ed.postThis(e);
}
public List<Employee> getAll() {
	return ed.getAll();
}
public String postAll(List<Employee> a) {
	return ed.postAll(a);
}
public List<Employee> maxSalary() {
	List<Employee> employ=ed.maxSalary();
	int max=employ.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	List<Employee> maximum=employ.stream().filter(x->x.getSalary()==max).collect(Collectors.toList());
//	//return ed.maxSalary(maximum);
	return maximum;
}
public Employee getId(int a) {
	return ed.getId(a);
}
public String getIds(int a) {
	return ed.getIds(a);
}
public List<Employee> midAge()  {
List<Employee>age=ed.midAge();
List<Employee>a=age.stream().filter(x->x.getAge()>25 && x.getAge()<35).collect(Collectors.toList());
return a;
}
}
