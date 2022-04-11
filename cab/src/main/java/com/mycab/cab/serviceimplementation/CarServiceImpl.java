package com.mycab.cab.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycab.cab.dao.CabRepository;
import com.mycab.cab.model.Car;
import com.mycab.cab.serviceinterface.Carinterface;

@Service
public class CarServiceImpl implements Carinterface {

	
//	private CabRepository repo;
//	public List<Car> findAllCars() {
//		// TODO Auto-generated method stub
//		return (List<Car>) repo.findAll();
//	}

	@Autowired
	private CabRepository carRepo;
	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return carRepo.save(car);
	}

	@Override
	public Car updateCar(Car car) {
		// TODO Auto-generated method stub
		return carRepo.save(car);
	}

	@Override
	public List<Car> findAllCar() {
		// TODO Auto-generated method stub
		return (List<Car>) carRepo.findAll();
	}

	@Override
	public void deleteCar(int car_id) {
		// TODO Auto-generated method stub
		carRepo.deleteById(car_id);
	}

}
