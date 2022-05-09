package ru.maxruazan.car_service.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.maxruazan.car_service.entity.Car;
import ru.maxruazan.car_service.entity.Service;

import java.util.List;

@Repository
public class ServiceDAOImpl implements ServiceDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public ServiceDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    public List<Service> getAllServices() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Service", Service.class).getResultList();
    }

    @Override
    public void saveService(Service service) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(service);
    }

    @Override
    public Service getService(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Service.class, id);
    }

    @Override
    public void deleteService(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Car> query = session.createQuery("delete from Service where id=: orderId");
        query.setParameter("orderId", id);
        query.executeUpdate();
    }
}
