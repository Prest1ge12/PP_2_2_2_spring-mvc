package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCars() {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1988, 12, "Porsche"));
        carList.add(new Car(1999, 13, "Ferrari"));
        carList.add(new Car(2002, 14, "Audi"));
        carList.add(new Car(2010, 15, "Bmw"));
        carList.add(new Car(2020, 16, "Mercedes"));

        // По 5 пункту не сработает при добавлении 6-го авто не понял.
        // При добавлении здесь авто и перезапуске томкат сервера проверил, вроде работает по заданию.

        carList.add(new Car(2022, 17, "SomeCar1"));
        carList.add(new Car(2012, 19, "SomeCar2"));
        carList.add(new Car(2032, 15, "SomeCar3"));
        return carList;
    }
}
