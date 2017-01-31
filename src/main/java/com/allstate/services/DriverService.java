package com.allstate.services;

import com.allstate.entities.Driver;
import com.allstate.repositories.IDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private IDriverRepository driverRepository;

    @Autowired
    public void setDriverRepository(IDriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public Driver create(Driver driver) {
        return this.driverRepository.save(driver);
    }

    public Iterable<Driver> find() {
        return this.driverRepository.findAll();
    }

    public Driver findById(int id) {
        return this.driverRepository.findOne(id);
    }

    public Driver findByName(String name) {
        return this.driverRepository.findByName(name);
    }

    public void delete(Driver driver) {
        this.driverRepository.delete(driver);
    }

    public void delete(int id) {
        this.driverRepository.delete(id);
    }
}
