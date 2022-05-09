package ru.maxruazan.car_service.DAO;

import ru.maxruazan.car_service.entity.Car;

import java.util.List;

public interface CarDAO {

     List<Car> getAllCars();

    void saveCar(Car car);

    Car getCar(int id);

    void deleteCar(int id);
}
