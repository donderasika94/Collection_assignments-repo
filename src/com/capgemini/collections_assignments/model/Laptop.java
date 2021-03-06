package com.capgemini.collections_assignments.model;

import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public Laptop() {
		super();
		
	}

	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Laptop))
			return false;
		if(obj == this)
			return true;
		Laptop laptop = (Laptop)obj;
		if(this.company == laptop.company && this.model == laptop.model)
			return true;
		else
		    return false;
	}
	
	public int hashCode() {
		return Objects.hash(company,model);
	}
	
	
	
	
	
	

}
