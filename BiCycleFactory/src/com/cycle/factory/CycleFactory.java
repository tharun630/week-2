package com.cycle.factory;

public class CycleFactory {
	
	public static Cycle createCycle(CycleAbstractFactory obj) {
		if(obj!=null) {
			return obj.createCyle();
		}
		return null;
		
	}

}
