package web.DAO;

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
        carList.add(new Car(2022, 17, "SomeCar"));
        return carList;
    }
}
