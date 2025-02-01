package com.example.carSale.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carSale.Main.Car;


public interface CarRepository extends JpaRepository<Car, Integer> {

}
