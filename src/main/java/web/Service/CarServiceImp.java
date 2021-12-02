package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> CarListCreate() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "W140", "1991-1998"));
        cars.add(new Car("Mercedes-Benz", "W220", "1998-2005"));
        cars.add(new Car("Mercedes-Benz", "W221", "2005-2013"));
        cars.add(new Car("Mercedes-Benz", "W222", "2013-2020"));
        cars.add(new Car("Mercedes-Benz", "W223", "2020-2021"));
        return cars;
    }

    @Override
    public List<Car> GetCarsListCount(Integer count) {
        return CarListCreate().subList(0, count);
    }
}
