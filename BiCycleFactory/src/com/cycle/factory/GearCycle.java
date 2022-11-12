package com.cycle.factory;

public class GearCycle implements Cycle{
	
	private String cycleType;
	private String desc;
	private Integer price;
	
	
	public GearCycle(String cycleType, String desc, Integer price) {
		super();
		this.cycleType = cycleType;
		this.desc = desc;
		this.price = price;
	}


	@Override
	public String cycleType() {
		// TODO Auto-generated method stub
		return this.cycleType;
	}


	@Override
	public String cycleDescription() {
		// TODO Auto-generated method stub
		return this.desc;
	}


	@Override
	public Integer getCyclePrice() {
		// TODO Auto-generated method stub
		return this.price;
	}


	@Override
	public String toString() {
		return "GearCycle [cycleType=" + cycleType + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
	

}
