package web.servise;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;


    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
