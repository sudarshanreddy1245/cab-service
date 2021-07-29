package com.cabbooking.com.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String address;
	
	private Long mobileNum;
	
	private String location;
	
	@ManyToMany(targetEntity = Driver.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "driver_cust_details",   
	            joinColumns = { @JoinColumn(name = "d_id") },   
	            inverseJoinColumns = { @JoinColumn(name = "c_id") })  
	private java.util.List<Driver> drivers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	

	public java.util.List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(java.util.List<Driver> drivers) {
		this.drivers = drivers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, mobileNum, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(mobileNum, other.mobileNum) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", mobileNum=" + mobileNum + "]";
	}
	
	
	

}
