package com.mycab.cab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mycab.cab.exception.negativeValue;



@Entity
@Table(name = "car",catalog = "yellow_cab")
public class Car {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;
	
	private int noOfSeat;
	private String carName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carId, int noOfSeat, String carName) {
		super();
		this.carId = carId;
		this.noOfSeat = noOfSeat;
		this.carName = carName;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat)throws negativeValue {
		if(noOfSeat< 0){
			throw new negativeValue("plz enter positive seat no");
			
		}
		else {
		this.noOfSeat = noOfSeat;
	}
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	
		
}
