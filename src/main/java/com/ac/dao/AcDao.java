package com.ac.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.ac.entity.Ac;
import com.ac.repository.AcRepository;

@Repository
public class AcDao {
	@Autowired
	AcRepository ar;
	public String postAll(List<Ac> a) {
		ar.saveAll(a);
		return "posted Successfully";
	}
public List<Ac> getAll() {
	return ar.findAll();
}
public List<Ac> getByBrand(String a) {
	return ar.getByBrand(a);
}
public List<Integer> getByPriceRange( int a,int b) {
	return ar.getByPriceRange(a,b);
}
public int getCount(String a) {
	return ar.getCount(a);
}
public int getMax() {
	return ar.getMax();
}
public Ac getMaxs() {
	return ar.getMaxs();
}
public List<Ac> getStart(char a) {
	return ar.getStart(a);
}
public List <Ac> getends( char a) {
	return ar.getends(a) ;	
}
public List<Ac> getcount() {
	return ar.getcount();
}
public List<Object> getByGroup() {
	return ar.getByGroup();
}
public int getcounting( String a) {
	return ar.getcounting(a);
}
public List<Ac> getsecmin() {
	return ar.getsecmin();
}
public List<String> getdistinct() {
return ar.getdistinct();
}
public List<Ac> getByPrice(int a) {
	return ar.getByPrice(a);
}
public Ac getbyid(int a) {
	return ar.findById(a).get();
}
}