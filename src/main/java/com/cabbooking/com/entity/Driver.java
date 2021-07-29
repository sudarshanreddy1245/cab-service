package com.cabbooking.com.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class Driver implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String carType;
	
	private Long mobileNum;
	
	private String carNum;
	
	private String currLocation;

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

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carType, id, mobileNum, name, carNum);
	}
	
	

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Objects.equals(carType, other.carType) && Objects.equals(id, other.id)
				&& Objects.equals(mobileNum, other.mobileNum) && Objects.equals(name, other.name)
				&& Objects.equals(carNum, this.carNum);
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", carType=" + carType + ", mobileNum=" + mobileNum + "]";
	}

}
