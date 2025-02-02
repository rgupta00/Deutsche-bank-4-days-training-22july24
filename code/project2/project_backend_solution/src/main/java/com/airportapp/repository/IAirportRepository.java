package com.airportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportapp.bo.AirportEntity;

public interface IAirportRepository extends JpaRepository<AirportEntity, Long> {
	
	List<AirportEntity> findByAirportEntityType(String type);

//	List<AirportEntity> findAirportsByType(String type);

	List<AirportEntity> findAirportsByAirportName(String name);

	List<AirportEntity> findAirportsByLatitude(double type);

	List<AirportEntity> findAirportsByLongitude(double type);

}
