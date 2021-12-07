package org.example;

import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testSetGetMaxSpeed() {
        Car car = new Car();
        car.setMaxSpeed(10);
        assertEquals(10, car.getMaxSpeed());
    }
}