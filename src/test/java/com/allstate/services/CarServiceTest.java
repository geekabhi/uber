package com.allstate.services;

import com.allstate.entities.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Year;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

    @Autowired
    private CarService carService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateCar() throws Exception {
        Car car = new Car();
        car.setVin("XYZ");
        car.setMake("Toyota");
        car.setModel("Innova");
        car.setYear(Year.now());
        Car expected = this.carService.create(car);

        assertNotNull(expected);
        assertTrue(expected.getId()>0);
        assertEquals("XYZ", expected.getVin());
    }


}