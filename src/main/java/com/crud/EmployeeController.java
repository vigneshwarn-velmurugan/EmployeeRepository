package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Employee")
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping(value="/postEmployee") 
public String postThis(@RequestBody Employee e) {
	return es.postThis(e);
}
@GetMapping(value=("/getValues"))
public List<Employee>getAll() {
	return es.getAll();
	
}
@PostMapping(value="/postValues") 
public String postAll(@RequestBody List<Employee> a) {
	return es.postAll(a);
}
@GetMapping(value="/getMax")
public List<Employee> maxSalary() {
	return es.maxSalary();
}
@GetMapping(value="/getById/{a}")
public Employee getId(@PathVariable int a) {
	return es.getId(a);
}
@GetMapping(value="/getId/{a}")
public String getIds(@PathVariable int a) {
	return es.getIds(a);
	
}
@GetMapping(value="/getAge") 
public List<Employee>midAge() {
	return es.midAge();
}
}
