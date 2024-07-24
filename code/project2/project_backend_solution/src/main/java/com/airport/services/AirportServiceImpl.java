package com.airport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.airportapp.repository.IAirportRepository;
import com.airportsapp.vo.AirportVO;
import com.airportsapp.vo.NavAidVO;
import com.airportsapp.vo.RegionVO;

@Service
public class AirportServiceImpl implements IAirportService{

	@Autowired
	private IAirportRepository airportRepository;
	
	@Override
	public List<AirportVO> listAllAirports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AirportVO> findAirportsByName(String name) {
		// TODO Auto-generated method stub
		//return airportRepository.findAirportsByAirportName(name);
		return null;
	}

	@Override
	public List<AirportVO> findAirportsByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AirportVO> findAirportsByRunways() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AirportVO> listAllHeliports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AirportVO> listAirportsByContinent(String continent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegionVO> listAllRegions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NavAidVO> listAllNavaids() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AirportVO getRandomAirport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listAllCountries() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> listAllContinents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AirportVO> airportsSorted(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listAirportsPaginated() {
		// TODO Auto-generated method stub
		
	}

}
