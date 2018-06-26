package edu.reactive.reactivejdbcdemo.rent;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentDao extends PagingAndSortingRepository<RentedHouse,String> {
}
