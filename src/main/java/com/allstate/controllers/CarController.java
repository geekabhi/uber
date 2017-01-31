package com.allstate.controllers;

import com.allstate.entities.Car;
import com.allstate.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public Car create(@RequestBody Car car) {
        return  this.carService.create(car);
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public Iterable<Car> findAll() {
        return  this.carService.find();
    }

    @RequestMapping(value = {"/vin/{vin}"}, method = RequestMethod.GET)
    public Car findByVin(@PathVariable String vin) {
        return  this.carService.findByVin(vin);
    }

    @RequestMapping(value = {"/id/{id}"}, method = RequestMethod.GET)
    public Car findById(@PathVariable int id) {
        return  this.carService.findById(id);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        this.carService.delete(id);
    }

}
