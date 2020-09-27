package com.ssafy.hw.step04;

public class Refrigerator {
	
	private String name;
	private int num;
	private int price;
	private int count;
	private int volume;
	
	public Refrigerator(String name, int num, int price, int count, int volume) {
		this.name=name;
		this.num=num;
		this.price=price;
		this.count=count;
		this.volume=volume;
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


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public String toString() {
		return this.num + " " + this.name + " " + this.price+ " " + this.count + " " + this.volume;

	}

}
