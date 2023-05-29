package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;



@Controller
public class CarController {


    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", required = false, defaultValue = "6") int count , Model model) {
        model.addAttribute( "cars", carService.getCars(count) );
        return "cars";
    }
}
