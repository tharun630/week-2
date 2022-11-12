package com.cycle.factory;

public class ElectricCycleFactory implements CycleAbstractFactory {
	
	
	private String cycleType;
	private String desc;
	private Integer price;
	
	
	

	public ElectricCycleFactory(String cycleType, String desc, Integer price) {
		super();
		this.cycleType = cycleType;
		this.desc = desc;
		this.price = price;
	}




	@Override
	public Cycle createCyle() {
		// TODO Auto-generated method stub
		return new ElectricCycle(this.cycleType, this.desc, this.price);
	}

	

}
