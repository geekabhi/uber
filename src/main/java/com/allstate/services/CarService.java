package com.allstate.services;

import com.allstate.entities.Car;
import com.allstate.repositories.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private ICarRepository carRepository;

    @Autowired
    public void setCarRepository(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car create(Car car) {
        return this.carRepository.save(car);
    }

    public Iterable<Car> find() {
        return this.carRepository.findAll();
    }

    public Car findById(int id) {
        return this.carRepository.findOne(id);
    }

    public Car findByVin(String vin) {
        return this.carRepository.findByVin(vin);
    }

    public void delete(Car car) {
        this.carRepository.delete(car);
    }

    public void delete(int id) {
        this.carRepository.delete(id);
    }
}
