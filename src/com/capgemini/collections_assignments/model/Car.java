package com.capgemini.collections_assignments.model;

import java.util.Objects;

public class Car implements Comparable<Car>{
	
	private String make;
	private String model;
	private int year;
	private double prize;
	public Car() {
		super();
		
	}
	public Car(String make, String model, int year, double prize) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.prize = prize;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", prize=" + prize + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Car))
			return false;
		if(obj == this)
			return true;
		Car cars = (Car)obj;
		if(this.make == cars.make && this.model == cars.model)
			return true;
		else
		    return false;
	}
	
	public int hashCode() {
		return Objects.hash(make,model);
	}
	
	@Override
	public int compareTo(Car car) {
		return this.make.compareTo(car.getMake());
	}

}
