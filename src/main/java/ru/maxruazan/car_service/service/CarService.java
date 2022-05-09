package ru.maxruazan.car_service.service;

import ru.maxruazan.car_service.entity.Car;
import java.util.List;

public interface CarService {

    public List<Car> getAllCars();

    public void saveCar(Car car);

    Car getCar(int id);

    public void deleteCar(int id);
}
