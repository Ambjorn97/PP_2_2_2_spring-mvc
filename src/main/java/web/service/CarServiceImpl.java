package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(int numberOfCars) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "X5"));
        cars.add(new Car(2, "Audi", "Q7"));
        cars.add(new Car(3, "Mercedes", "E-classe W212"));
        cars.add(new Car(4, "Nissan", "Patrol"));
        cars.add(new Car(5, "Ford", "Escort"));
        return cars.subList(0, Math.min(numberOfCars, cars.size()));
    }
}
