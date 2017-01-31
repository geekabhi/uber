package com.allstate.controllers;

import com.allstate.entities.Car;
import com.allstate.services.CarService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CarService carService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldPOSTCarObject() throws Exception {

        // Stub
        Car car = new Car();
        car.setId(1);
        car.setVin("hello");

        when(this.carService.create(any())).thenReturn(car);

        MockHttpServletRequestBuilder request = post("/cars")
                                                    .contentType(MediaType.APPLICATION_JSON)
                                                    .content("{ \"vin\": \"hello\"}");

        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.vin",is("hello")));

    }

    @Test
    public void shouldfindCarByVin() throws Exception {

        // Stub
        Car car = new Car();
        car.setId(1);
        car.setVin("ASDF");

        when(this.carService.findByVin(any())).thenReturn(car);

        MockHttpServletRequestBuilder request = get("/cars/vin/ASDF")
                .contentType(MediaType.APPLICATION_JSON);

        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.vin",is("ASDF")));

    }

    @Test
    public void shouldfindCarById() throws Exception {

        // Stub
        Car car = new Car();
        car.setId(1);
        car.setVin("ASDF");

        when(this.carService.findById(anyInt())).thenReturn(car);

        MockHttpServletRequestBuilder request = get("/cars/id/1")
                .contentType(MediaType.APPLICATION_JSON);

        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.vin",is("ASDF")));

    }

    @Test
    public void shouldDeleteCarById() throws Exception {

        MockHttpServletRequestBuilder request = delete("/cars/1")
                .contentType(MediaType.APPLICATION_JSON);

        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk());

    }
}