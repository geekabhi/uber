package com.allstate.controllers;

import com.allstate.entities.City;
import com.allstate.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

    private CityService cityService;

    @Autowired
    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public City create(@RequestBody City city) {
        return  this.cityService.create(city);
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public Iterable<City> findAll() {
        return  this.cityService.find();
    }

    @RequestMapping(value = {"/name/{name}"}, method = RequestMethod.GET)
    public City findByName(@PathVariable String name) {
        return  this.cityService.findByName(name);
    }

    @RequestMapping(value = {"/id/{id}"}, method = RequestMethod.GET)
    public City findById(@PathVariable int id) {
        return  this.cityService.findById(id);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        this.cityService.delete(id);
    }

}
