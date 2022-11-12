package com.cycle.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.cycle.client.BiCyleInfoClient;
import com.cycle.factory.CycleFactory;
import com.cycle.factory.ElectricCycle;
import com.cycle.factory.GearCycle;
import com.cycle.factory.GearCycleFactory;
import com.cycle.singleton.SingletonClass;

public class BicyleInfoClientTest {

    BiCyleInfoClient biCyleInfoClient;
	GearCycle gearCycle;    
	ElectricCycle electricCycle;
	
	@Before
	public void setUp() {
		biCyleInfoClient= new BiCyleInfoClient();
		gearCycle = new GearCycle("Gear", "With Gear description ", 15000);
		electricCycle = new ElectricCycle("Electric", "Gear with electric", 30000);
	}

	@Test
	public void testGearCyleObjectNotNull() {
		assertNotNull(CycleFactory.createCycle(
				new GearCycleFactory(gearCycle.cycleType(), gearCycle.cycleDescription(), gearCycle.getCyclePrice())));
	}

	@Test
	public void testElectricCyleObjectNull() {
		assertNull(CycleFactory.createCycle(null));
	}
	
	@Test
	public void testElectricCyleObjectNotNull() {
		assertNotNull(CycleFactory.createCycle(
				new GearCycleFactory(electricCycle.cycleType(), electricCycle.cycleDescription(), electricCycle.getCyclePrice())));
	}
	
	@Test
	public void testDiscountedPrice() {
		assertEquals(9000, (Object)biCyleInfoClient.getDiscountPrice(10000));
	}
	
	@Test
	public void testNotNullSingletonObj() {
		assertNotNull(SingletonClass.getInstance());
	}

	

}
