package com.allstate.services;

import com.allstate.entities.Driver;
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
public class DriverServiceTest {
    @Autowired
    private DriverService driverService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateDriver() throws Exception {

        Driver driver = new Driver();

        driver.setName("Ramu");
        driver.setAge(30);
        driver.setGender(Gender.MALE);

        Driver expected = this.driverService.create(driver);

        assertNotNull(expected);
        assertTrue(expected.getId()> 0);
        assertEquals("Ramu", expected.getName());
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