package com.ac.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ac.entity.Ac;
public interface AcRepository extends JpaRepository<Ac,Integer> {
@Query (value="select * from ac_table where brand like ? ",nativeQuery =true)
public List<Ac> getByBrand(String a);
@Query(value="select Price from ac_table where price > ? && price < ? order by price", nativeQuery=true)
public List<Integer> getByPriceRange(int a,int b);
@Query(value="select count(*) from ac_table where brand= ?",nativeQuery=true)
public int getCount(String a);
@Query(value="select max(price) from ac_table",nativeQuery=true) 
public int getMax();
@Query (value="select * from ac_table where price =(select max(price) from ac_table)",nativeQuery=true)
public Ac getMaxs();
@Query(value="select * from ac_table where brand like ?%",nativeQuery=true)
public List<Ac> getStart(char a);
@Query(value="select * from ac_table where brand like %?",nativeQuery=true)
public List<Ac> getends(char a);
@Query(value="select * from ac_table where length(brand)>5",nativeQuery=true) 
public List<Ac> getcount();
@Query(value="select brand,count(*) from ac_table group by brand",nativeQuery=true) 
public List<Object> getByGroup();
@Query(value="select count(brand) from ac_table where brand like ?",nativeQuery=true)
public int getcounting(String a);
@Query(value="select * from ac_table where price=(select min(price) from ac_table where price>(select min(price) from ac_table))",nativeQuery=true)
public List<Ac> getsecmin();
@Query(value="select distinct brand from ac_table",nativeQuery=true)
public List<String> getdistinct();
@Query(value="select b from Ac b where price >:p")
public List<Ac> getByPrice(@Param("p") int a);
}