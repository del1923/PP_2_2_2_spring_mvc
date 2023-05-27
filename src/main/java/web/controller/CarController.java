package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;


@Controller
public class CarController {

    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", required = false) int count , Model model) {
        model.addAttribute( "cars", carService.getCars(count) );

        //добавить передачу в вид списка авто

        return "cars";
    }
}
