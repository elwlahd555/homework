package com.ssafy.hw.step05;

public class Product {
	
	private int number;
	private int price;
	private int count;
	private String name;
	
	Product(){
		
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Product [number=" + number + ", price=" + price + ", count=" + count + ", name=" + name + "]";
	}


	

}
