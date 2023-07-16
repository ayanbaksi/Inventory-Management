package com.webapp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.Model.Location;
import com.webapp.demo.Service.LocationService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LocationsController {
	@Autowired
	LocationService location;

	@PostMapping("/locations")
	public void setloc(@RequestBody Location l) {
		location.setLocation(l);
	}

	@ResponseBody
	@GetMapping("/locations")
	public List<Location> getloc() {
		return location.getLocation();
	}

	@PutMapping("/locations")
	public void putloc(@RequestBody Location l) {
		location.editLocation(l);
	}

	@DeleteMapping("/locations")
	public void delloc(int id) {
		location.deleteLocation(id);
	}
}
