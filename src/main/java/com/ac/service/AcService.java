package com.ac.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ac.dao.AcDao;
import com.ac.entity.Ac;

@Service
public class AcService {
@Autowired
AcDao ad;
public String postAll(List<Ac> a) {
	return ad.postAll(a);
}
public List<Ac> getAll() {
	return ad.getAll();
}
public List<Ac> getByBrand(String a) {
	return ad.getByBrand(a);
}
public List<Integer> getByPriceRange( int a, int b) {
	return ad.getByPriceRange(a,b);
}
public int getCount(String a) {
	return ad.getCount(a);
}
public int getMax() {
	return ad.getMax();
}
public Ac getMaxs() {
	return ad.getMaxs();
}
public List<Ac> getStart(char a) {
	return ad.getStart(a);
}
public List <Ac> getends( char a) {
	return ad.getends(a) ;	
}
public List<Ac> getcount() {
	return ad.getcount();
}
public List<Object> getByGroup() {
	return ad.getByGroup();
}
public int getcounting( String a) {
	return ad.getcounting(a);
}
public List<Ac> getsecmin() {
	return ad.getsecmin();
}
public List<String> getdistinct() {
return ad.getdistinct();
}
public List<Ac> getByPrice( int a) {
	return ad.getByPrice(a);
}
public Ac getbyid(int a) {
	return ad.getbyid(a);
}
}
