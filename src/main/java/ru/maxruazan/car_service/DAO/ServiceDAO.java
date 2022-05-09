package ru.maxruazan.car_service.DAO;

import ru.maxruazan.car_service.entity.Service;

import java.util.List;

public interface ServiceDAO {

    List<Service> getAllServices();

    void saveService(Service service);

    Service getService(int id);

    void deleteService(int id);
}
