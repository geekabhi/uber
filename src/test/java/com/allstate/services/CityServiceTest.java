package com.allstate.services;

import com.allstate.entities.City;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void create() throws Exception {
        City city = new City();
        city.setName("Bangalore");
        city.setState("KA");

        City expected = this.cityService.create(city);

        assertNotNull(expected);
        assertTrue(expected.getId()>0);
        assertEquals("Bangalore", expected.getName());
        assertEquals("KA", expected.getState());
    }

    @Test
    public void find() throws Exception {
        List<City> expected = (ArrayList<City>)this.cityService.find();

        assertNotNull(expected);
        assertTrue(expected.get(0).getId()>0);
        assertEquals("delhi", expected.get(0).getName());
        assertEquals("delhi", expected.get(0).getState());
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