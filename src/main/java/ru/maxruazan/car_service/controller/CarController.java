package ru.maxruazan.car_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maxruazan.car_service.entity.Car;
import ru.maxruazan.car_service.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;



    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/")
    public String showTitle() {
        return "title-page";
    }


    @RequestMapping("/allCars")
    public String showAllCars(Model model) {
    List<Car> allCars = carService.getAllCars();
    model.addAttribute("allCars", allCars);
        return "all-cars";
    }

    @RequestMapping("/addNewCar")
    public  String addNewCar(Model model) {
    Car car = new Car();
    model.addAttribute("car", car);
        return "car-info";
    }

    @RequestMapping("/saveCar")
    public String saveCar(@ModelAttribute("car") Car car){
        carService.saveCar(car);
        return "redirect:/allCars";
    }

    @RequestMapping("/updateInfo")
    public String updateCar(@RequestParam("carId") int id, Model model) {
        Car car = carService.getCar(id);
      model.addAttribute("car", car); //стринг из вью car-info :  modelAttribute="car">
        return "car-info";
    }

    @RequestMapping("/deleteCar")
    public String deleteCar(@RequestParam("carId") int id) {
        carService.deleteCar(id);
    return "redirect:/allCars";
    }
}
