package com.allstate.controllers;

import com.allstate.entities.Driver;
import com.allstate.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {

    private DriverService driverService;

    @Autowired
    public void setDriverService(DriverService driverService) {
        this.driverService = driverService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public Driver create(@RequestBody Driver driver) {
        return  this.driverService.create(driver);
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public Iterable<Driver> findAll() {
        return  this.driverService.find();
    }

    @RequestMapping(value = {"/name/{name}"}, method = RequestMethod.GET)
    public Driver findByName(@PathVariable String name) {
        return  this.driverService.findByName(name);
    }

    @RequestMapping(value = {"/id/{id}"}, method = RequestMethod.GET)
    public Driver findById(@PathVariable int id) {
        return  this.driverService.findById(id);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        this.driverService.delete(id);
    }

}
