package com.allstate.services;

import com.allstate.entities.Car;
import com.allstate.entities.Trip;
import com.allstate.repositories.ICarRepository;
import com.allstate.repositories.ITripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;

@Service
public class CarService {
    private ICarRepository carRepository;
    private ITripRepository tripRepository;

    @Autowired
    public void setCarRepository(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired
    public void setTripRepository(ITripRepository tripRepository) {
        this.tripRepository = tripRepository;
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
        deleteTripsByCarId(car.getId());
        this.carRepository.delete(car);
    }

    public void delete(int id) {
        deleteTripsByCarId(id);
        this.carRepository.delete(id);

    }

    private void deleteTripsByCarId(int id) {
        Iterator<Trip> tripIterator = this.tripRepository.findTripByCarId(id).iterator();

        while(tripIterator.hasNext()) {
            Trip trip = tripIterator.next();
            this.tripRepository.delete(trip); //TODO move trip data to historic tables.
        }
    }
}
