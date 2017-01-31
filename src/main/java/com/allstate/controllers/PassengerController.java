package com.allstate.controllers;

import com.allstate.entities.Passenger;
import com.allstate.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/passengers")
public class PassengerController {

    private PassengerService passengerService;

    @Autowired
    public void setPassengerService(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public Passenger create(@RequestBody Passenger passenger) {
        return  this.passengerService.create(passenger);
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public Iterable<Passenger> findAll() {
        return  this.passengerService.find();
    }

    @RequestMapping(value = {"/name/{name}"}, method = RequestMethod.GET)
    public Passenger findByName(@PathVariable String name) {
        return  this.passengerService.findByName(name);
    }

    @RequestMapping(value = {"/id/{id}"}, method = RequestMethod.GET)
    public Passenger findById(@PathVariable int id) {
        return  this.passengerService.findById(id);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        this.passengerService.delete(id);
    }

}
