package com.example.carSale.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.carSale.Main.Car;
import com.example.carSale.Service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
CarService cService;
@GetMapping("get-all")
@ResponseStatus(HttpStatus.ACCEPTED)
public List<Car> findAll(){
	return cService.findAllCars();
}

@GetMapping("/{id}")
public Optional<Car> findById(@PathVariable Integer id){
	return cService.findById(id);
}
@ResponseStatus(HttpStatus.CREATED)
@PostMapping("add")
public void save(@RequestBody Car car) {
	cService.saveCar(car);

}

}
