package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

   private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("LADA", 2107, "красный", 2010));
        carList.add(new Car("Москвич", 2141, "белый", 1980));
        carList.add(new Car("VOLVO", 60, "синий", 2007));
        carList.add(new Car("ГАЗ", 2410, "зелёный", 1985));
        carList.add(new Car("Mercedes", 600, "чёрный", 2015));
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.subList( 0, Math.min( count, carList.size()) );
    }
}
