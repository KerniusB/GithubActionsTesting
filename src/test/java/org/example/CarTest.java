package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CarTest extends TestCase {

    @Test
    public void testSetGetMaxSpeed() {
        Car car = new Car();
        car.setMaxSpeed(10);
        assertEquals(15, car.getMaxSpeed());
    }
}