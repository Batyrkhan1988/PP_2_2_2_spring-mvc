package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService implements CarServiceImpl {

    @Override
    public List<Car> getCarsList(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Priora", "2170", "red"));
        carsList.add(new Car("Vesta", "2180", "yellow"));
        carsList.add(new Car("Kalina", "1117", "white"));
        carsList.add(new Car("Granta", "2190", "black"));
        carsList.add(new Car("GAZ", "3102", "silver"));
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
