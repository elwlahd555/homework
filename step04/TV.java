package com.ssafy.hw.step04;

public class TV {
	
	private String name;
	private int num;
	private int price;
	private int count;
	private int inch;
	private String type;
	
	
	public TV(String name, int num, int price, int count, int inch, String type) {
		this.name=name;
		this.num=num;
		this.price=price;
		this.count=count;
		this.inch=inch;
		this.type=type;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
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


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String toString() {
		return this.num + " " + this.name + " " + this.price+ " " + this.count + " " + this.inch + " "+ this.type;

	}
}
