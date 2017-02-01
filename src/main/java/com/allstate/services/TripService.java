package com.allstate.services;

import com.allstate.entities.Trip;
import com.allstate.repositories.ITripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {
    private ITripRepository tripRepository;

    @Autowired
    public void setTripRepository(ITripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip create(Trip trip) {
        return this.tripRepository.save(trip);
    }

    public Iterable<Trip> find() {
        return this.tripRepository.findAll();
    }

    public Trip findById(int id) {
        return this.tripRepository.findOne(id);
    }

    public Iterable<Trip> findTripByCarId(int carId) {
        return this.tripRepository.findTripByCarId(carId);
    }

    public void delete(Trip trip) {
        this.tripRepository.delete(trip);
    }

    public void delete(int id) {
        this.tripRepository.delete(id);
    }
}
