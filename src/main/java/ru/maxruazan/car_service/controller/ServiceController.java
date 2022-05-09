package ru.maxruazan.car_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maxruazan.car_service.entity.Service;
import ru.maxruazan.car_service.service.ServiceService;

import java.util.List;

@Controller
public class ServiceController {

    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }


    @RequestMapping("/allServices")
    public String showAllOrders(Model model) {
        List<Service> allServices = serviceService.getAllServices();
        model.addAttribute("allServices", allServices);
        return "all-services";
    }


    @RequestMapping("/addNewService")
    public String addNewOrder(Model model) {
        Service service = new Service();
        model.addAttribute("service", service);  //orderId
        return "service-info";
    }

    @RequestMapping("/saveService")
    public String saveOrder(@ModelAttribute("service") Service service) {   //order
        serviceService.saveService(service);
        return "redirect:/allServices";
    }

    @RequestMapping("/deleteService")
    public String deleteOrder(@RequestParam("serviceId") int id) {   //carId
        serviceService.deleteService(id);
        return "redirect:/allServices";
    }

    @RequestMapping("/updateServiceInfo")
    public String updateOrderInfo(@RequestParam("serviceId") int id, Model model) {  //carId
    Service service = serviceService.getService(id);
    model.addAttribute("service", service);  //order
        return "service-info";
    }
}
