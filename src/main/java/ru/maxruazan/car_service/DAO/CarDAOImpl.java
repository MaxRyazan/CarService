package ru.maxruazan.car_service.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.maxruazan.car_service.entity.Car;


import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

private final SessionFactory sessionFactory;

    @Autowired
    public CarDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Car> getAllCars() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Car", Car.class).getResultList();
    }

    @Override
    public void saveCar(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(car);
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Car.class, id);
    }

    @Override
    public void deleteCar(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Car> query = session.createQuery("delete from Car where id=: carId");
        query.setParameter("carId", id);
        query.executeUpdate();
    }
}
