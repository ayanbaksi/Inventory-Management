package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Location;
import com.webapp.demo.Repository.Locationdao;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	Locationdao location;

	@Override
	public List<Location> getLocation() {
		// TODO Auto-generated method stub
		return location.findAll();
	}

	@Override
	public void setLocation(Location l) {
		location.save(l);

	}

	@Override
	public void editLocation(Location l) {
		location.save(l);

	}

	@Override
	public void deleteLocation(int id) {
		location.deleteById(id);

	}

}
