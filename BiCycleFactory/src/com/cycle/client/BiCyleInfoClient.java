package com.cycle.client;

import com.cycle.factory.Cycle;
import com.cycle.factory.CycleFactory;
import com.cycle.factory.ElectricCycleFactory;
import com.cycle.factory.GearCycleFactory;
import com.cycle.singleton.SingletonClass;

public class BiCyleInfoClient {

	public static void main(String[] args) {

		// Factory Pattern to create Instances

		Cycle gearCycle = CycleFactory
				.createCycle(new GearCycleFactory("Gear Type", "Normal Cycle Added with Gears ", 10000));

		Cycle electricCycle = CycleFactory.createCycle(new ElectricCycleFactory("Gear Type+ Automatic Battery type",
				"Gear Cycle Added with Battery system without peddle ", 28000));

		System.out.println(gearCycle);
		System.out.println(electricCycle);

		// Singleton Pattern to Update the Discount price flat 10% percent discount
		// festival Season like Christmas and newyear
		Integer discountPrice = getDiscountPrice(gearCycle.getCyclePrice());
		SingletonClass singleTonObj = SingletonClass.getInstance();
		singleTonObj.setPrice(discountPrice);

		System.out.println("Price After the Discount " + discountPrice);
	}

	public static Integer getDiscountPrice(Integer price) {
		return price - price * 10 / 100;
	}

}
