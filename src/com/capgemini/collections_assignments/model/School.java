package com.capgemini.collections_assignments.model;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String district;
	private String schoolGrade;
	public School() {
		super();
		
	}
	public School(String name, String city, String district, String schoolGrade) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.schoolGrade = schoolGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSchoolGrade() {
		return schoolGrade;
	}
	public void setSchoolGrade(String schoolGrade) {
		this.schoolGrade = schoolGrade;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", schoolGrade=" + schoolGrade
				+ "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof School))
			return false;
		if(obj == this)
			return true;
		School school = (School)obj;
		if(this.name == school.name && this.city == school.city && this.district == school.district)
			return true;
		else
		    return false;
	}
	

	public int hashCode() {
		return Objects.hash(name,city,district);
	}
	
	

}
