package com.allstate.services;

import com.allstate.entities.Trip;
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
public class TripServiceTest {
    @Autowired
    private TripService tripService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void create() throws Exception {
        Trip trip = new Trip();

        trip.setCost(10.00d);

        Date oldDate = new Date();
        final long hoursInMillis = 60L * 60L * 1000L;
        Date newDate = new Date(oldDate.getTime() +
                (2L * hoursInMillis));

        trip.setStart(oldDate);
        trip.setStop(newDate);

        Trip expected = this.tripService.create(trip);

        assertNotNull(expected);
        assertTrue(expected.getId()>0);


    }

    @Test
    public void find() throws Exception {

    }

    @Test
    public void findById() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void delete1() throws Exception {

    }

}