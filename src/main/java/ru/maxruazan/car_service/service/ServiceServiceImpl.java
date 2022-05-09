package ru.maxruazan.car_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.maxruazan.car_service.DAO.ServiceDAO;
import ru.maxruazan.car_service.entity.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    private  final ServiceDAO serviceDAO;
    @Autowired
    public ServiceServiceImpl(ServiceDAO serviceDAO) {
        this.serviceDAO = serviceDAO;
    }

    @Override
    @Transactional
    public List<Service> getAllServices() {
        return serviceDAO.getAllServices();
    }

    @Override
    @Transactional
    public void saveService(Service service) {
    serviceDAO.saveService(service);
    }

    @Override
    @Transactional
    public Service getService(int id) {
        return serviceDAO.getService(id);
    }

    @Override
    @Transactional
    public void deleteService(int id) {
    serviceDAO.deleteService(id);
    }
}
