package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Location;

public interface LocationService {

	public List<Location> getLocation();

	public void setLocation(Location l);

	public void editLocation(Location l);

	public void deleteLocation(int id);
}
