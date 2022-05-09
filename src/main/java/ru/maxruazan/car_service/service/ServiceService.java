package ru.maxruazan.car_service.service;

import ru.maxruazan.car_service.entity.Service;

import java.util.List;

public interface ServiceService {
    List<Service> getAllServices();

    void saveService(Service service);

    Service getService(int id);

    void deleteService(int id);
}
