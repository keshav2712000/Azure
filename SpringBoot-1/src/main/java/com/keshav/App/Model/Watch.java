package com.keshav.App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Watch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	private String brand;
	private String color;
	private int price;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Watch [code=" + code + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
	

}
