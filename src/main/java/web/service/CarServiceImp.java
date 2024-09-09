package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    final private CarDaoImp carDaoImp;

    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public List<Car> getCars() {
        return carDaoImp.getCars();
    }
}
