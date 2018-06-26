package edu.reactive.reactivejdbcdemo.rent;

import edu.reactive.reactivejdbcdemo.rent.RentDao;
import edu.reactive.reactivejdbcdemo.rent.RentedHouse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RentService {

    private RentDao rentDao;

    public RentService(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    public List<RentedHouse> getAllHouses() {

        List<RentedHouse> rentedHouseList = new ArrayList<>();
        Iterable<RentedHouse> rentedHousedIterable = rentDao.findAll();

        rentedHousedIterable.forEach(rentedHouseList::add);

        return rentedHouseList;
    }
}
