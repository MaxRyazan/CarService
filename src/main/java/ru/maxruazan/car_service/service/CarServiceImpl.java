package ru.maxruazan.car_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.maxruazan.car_service.DAO.CarDAO;
import ru.maxruazan.car_service.entity.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;
    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carDAO.saveCar(car);
    }

    @Override
    @Transactional
    public Car getCar(int id) {
       return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
         carDAO.deleteCar(id);
    }
}
