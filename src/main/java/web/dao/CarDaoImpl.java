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
        /*
        добавить ещё 4 шт!
         */
    }



    @Override
    public List<Car> getCars(int count) {
        /*
        нужно проверить сколько записей возвращать
         */
        return null;
    }
}
