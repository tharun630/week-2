package com.cycle.singleton;
public class SingletonClass {
	
	private Integer price;
	
	

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	static SingletonClass obj = new SingletonClass();
	
	public static SingletonClass getInstance() {		
		return obj;
	}
	
	
	@Override
	public String toString() {
		return "SingletonClass [price=" + price + "]";
	}
	
	

}