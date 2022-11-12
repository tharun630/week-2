package com.cycle.factory;

public class GearCycleFactory implements CycleAbstractFactory {

	private String cycleType;
	private String desc;
	private Integer price;
	
	
	

	public GearCycleFactory(String cycleType, String desc, Integer price) {
		super();
		this.cycleType = cycleType;
		this.desc = desc;
		this.price = price;
	}




	@Override
	public Cycle createCyle() {
		// TODO Auto-generated method stub
		return new GearCycle(this.cycleType, this.desc, this.price);
	}

}
