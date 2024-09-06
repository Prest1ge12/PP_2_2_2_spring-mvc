package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1988, 12, "Porsche"));
        carList.add(new Car(1999, 13, "Ferrari"));
        carList.add(new Car(2002, 14, "Audi"));
        carList.add(new Car(2010, 15, "Bmw"));
        carList.add(new Car(2020, 16, "Mercedes"));
        return carList;
    }
}
