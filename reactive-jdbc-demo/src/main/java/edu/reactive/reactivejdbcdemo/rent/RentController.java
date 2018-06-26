package edu.reactive.reactivejdbcdemo.rent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RentController {

    private RentService rentService;

    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @GetMapping(path="/rentedHouses")
    public List<RentedHouse> getAllHouses(){
        return rentService.getAllHouses();
    }
}
