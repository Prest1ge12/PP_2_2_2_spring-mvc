package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count,
                            Model model) {

        List<Car> carList;

        if (count != null) {
            carList = carService.getCars().stream().limit(Long.parseLong(count)).toList();
        } else {
            carList = carService.getCars();
        }

        model.addAttribute("carList", carList);

        return "cars";
    }
}
