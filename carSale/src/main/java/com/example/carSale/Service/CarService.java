package com.example.carSale.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carSale.Main.Car;
import com.example.carSale.Repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;

	public List<Car> findAllCars(){
		return carRepository.findAll();
	}
	public Optional<Car> findById(Integer id){
		return carRepository.findById(id);
	}
	public void saveCar(Car Car) {
		carRepository.save(Car);
	}
}
