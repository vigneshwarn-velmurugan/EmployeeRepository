package com.ac.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ac.entity.Ac;
import com.ac.service.AcService;

@RestController
@RequestMapping(value="/Ac")
public class AcController {
@Autowired
AcService as;
@PostMapping(value="/postAll") 
public String postAll(@RequestBody List<Ac> a) {
	return as.postAll(a);
}
@GetMapping(value="/getAll") 
public List<Ac> getAll() {
	return as.getAll();
}
@GetMapping(value="/getByBrand/{a}") 
public List<Ac> getByBrand(@PathVariable String a) {
	return as.getByBrand(a);
}
@GetMapping(value="/getByPriceRange/{a}/{b}") 
public List<Integer> getByPriceRange(@PathVariable int a,@PathVariable int b) {
	return as.getByPriceRange(a,b);
}
@GetMapping(value="/getCount/{a}") 
public int getCount(@PathVariable String a) {
	return as.getCount(a);
}
@GetMapping(value="/getMax")
public int getMax() {
	return as.getMax();
}
@GetMapping(value="/getMaxs")
public Ac getMaxs() {
	return as.getMaxs();
}
@GetMapping (value="/getStarts/{a}")
public List <Ac> getStart(@PathVariable char a) {
	return as.getStart(a) ;	
}
@GetMapping (value="/getEnds/{a}")
public List <Ac> getends(@PathVariable char a) {
	return as.getends(a) ;	
}
@GetMapping (value="/getLength")
public List<Ac> getcount() {
	return as.getcount();
}
@GetMapping(value="/getGroup")
public List<Object> getByGroup() {
	return as.getByGroup();
}
@GetMapping(value="/getFieldCount/{a}")
public int getcounting(@PathVariable String a) {
	return as.getcounting(a);
}
@GetMapping(value="/getsecMin")
public List<Ac> getsecmin() {
	return as.getsecmin();
}
@GetMapping(value="/getDistinct")
public List<String> getdistinct() {
return as.getdistinct();
}
@GetMapping(value="/getByPrice/{a}") 
	public List<Ac> getByPrice(@PathVariable int a) {
	return as.getByPrice(a);
}
@GetMapping(value="/getById/{a}")
public Ac getbyid(@PathVariable int a) {
	return as.getbyid(a);
}
}