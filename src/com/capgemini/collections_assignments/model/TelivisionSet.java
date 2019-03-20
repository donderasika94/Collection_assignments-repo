package com.capgemini.collections_assignments.model;

import java.util.Objects;

public class TelivisionSet {
	
	private String company;
	private String type;
	private boolean is3Denabled;
	private double prize;
	public TelivisionSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TelivisionSet(String company, String type, boolean is3Denabled, double prize) {
		super();
		this.company = company;
		this.type = type;
		this.is3Denabled = is3Denabled;
		this.prize = prize;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public boolean isIs3Denabled() {
		return is3Denabled;
	}
	public void setIs3Denabled(boolean is3Denabled) {
		this.is3Denabled = is3Denabled;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	
	@Override
	public String toString() {
		return "TelivisionSet [company=" + company + ", type=" + type + ", is3Denabled=" + is3Denabled + ", prize=" + prize
				+ "]";
	}
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof TelivisionSet))
			return false;
		if(obj == this)
			return true;
		TelivisionSet tv = (TelivisionSet)obj;
		if(this.company == tv.company && this.type == tv.type && this.prize == tv.prize)
			return true;
		else
		    return false;
	}
	
	public int hashCode() {
		return Objects.hash(company,type,prize);
	}
	

}
