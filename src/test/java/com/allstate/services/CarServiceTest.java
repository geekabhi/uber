package com.allstate.services;

import com.allstate.entities.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
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
        car.setYear(2015);
        Car expected = this.carService.create(car);

        assertNotNull(expected);
        assertTrue(expected.getId()>0);
        assertEquals("XYZ", expected.getVin());
    }

    @Test
    public void shouldFindCarById() throws Exception {

        Car expected = this.carService.findById(1);

        assertNotNull(expected);
        assertEquals("ASDF", expected.getVin());
    }

    @Test
    public void shouldFindCarByVin() throws Exception {

        Car expected = this.carService.findByVin("ASDF");

        assertNotNull(expected);
        assertEquals("ASDF", expected.getVin());
    }

    @Test
    public void shouldDeleteCarById() throws Exception {

        this.carService.delete(1);

        Car expected = this.carService.findById(1);

        assertNull(expected);
    }

    @Test
    public void shouldDeleteCar() throws Exception {
        Car car = this.carService.findById(1);

        this.carService.delete(car);

        Car expected = this.carService.findById(1);

        assertNull(expected);
    }
}