package com.Hiber.Demo.Dto;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "phoneDetails")
public class Phone implements Serializable
{
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "brandName")
	private String brandName;
	
	@Column(name = "modelNo")
	private String modelNo;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "color")
	private String color;
	
	
	public Phone() 
	{
		// TODO Auto-generated constructor stub
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
