package com.mycab.cab.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycab.cab.model.Car;



@Repository
public interface CabRepository extends CrudRepository<Car, Integer> {  
	
//	@Query("FROM CAR WHERE NO_OF_SEATS > 5")
//	public List<Car> findByNoOfSeat(int noOfSeat);
	
	
	

}
