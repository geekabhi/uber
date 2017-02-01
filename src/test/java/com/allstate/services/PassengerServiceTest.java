package com.allstate.services;

import com.allstate.entities.Passenger;
import com.allstate.enums.Gender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class PassengerServiceTest {

    @Autowired
    private PassengerService passengerService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreatePassenger() throws Exception {
        Passenger passenger = new Passenger();
        passenger.setName("Adam");
        passenger.setAge(25);
        passenger.setGender(Gender.MALE);

        Passenger expected = this.passengerService.create(passenger);

        assertNotNull(expected);
        assertTrue(expected.getId()>0);
        assertEquals("Adam", expected.getName());
    }

    @Test
    public void find() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void findByName() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void delete1() throws Exception {

    }

}