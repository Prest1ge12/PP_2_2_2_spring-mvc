package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDaoImp carDaoImp;

    @Override
    public List<Car> getCars() {
        return carDaoImp.getCars();
    }
}
