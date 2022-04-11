package com.mycab.cab.controller;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycab.cab.dao.CabRepository;
import com.mycab.cab.model.Car;
import com.mycab.cab.serviceimplementation.CarServiceImpl;

import antlr.collections.List;
@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	private CarServiceImpl carserviceimpl;
	
	
	@PostMapping(value = "saveCar")
	public Car saveCar(@RequestBody Car car) {
		carserviceimpl.saveCar(car);
		return car;
	}
	
	@GetMapping(value = "getAllCar")
	public java.util.List<Car> findAllCar(){
		System.out.println(carserviceimpl.findAllCar());
		return carserviceimpl.findAllCar();
		
		
		
	}
	@PutMapping("updateCar")
	public Car updateCar(@RequestBody Car car) {
		return carserviceimpl.updateCar(car);
	}
	
	@DeleteMapping("deleteCar")
	public String deleteCar(@RequestParam int carId) {
		carserviceimpl.deleteCar(carId);
		return "data deleted";
				
	}
	
	
}
