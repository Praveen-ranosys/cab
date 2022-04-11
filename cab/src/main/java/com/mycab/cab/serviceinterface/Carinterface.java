package com.mycab.cab.serviceinterface;

import java.util.List;

import com.mycab.cab.model.Car;

public interface Carinterface {
	
	//to save car
	public Car saveCar(Car car);
	
	//to update car
	public Car updateCar(Car car);
	
	//to fetch all car from db
	public List<Car> findAllCar();
	
	//to delete Car
	public void deleteCar(int car_id);
	
		
	
	}

