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

import com.webapp.demo.Model.Shipment;

import com.webapp.demo.Service.ShipmentService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ShipmentsController {

	@Autowired
	ShipmentService shipmentService;

	@PostMapping("/shipments")
	public void setShipments(@RequestBody Shipment sh) {
		shipmentService.setShipment(sh);
	}

	@ResponseBody
	@GetMapping("/shipments")
	public List<Shipment> getShipments() {
		return shipmentService.getShipment();
	}

	@PutMapping("/shipments")
	public void editShioments(@RequestBody Shipment sh) {
		shipmentService.editShipment(sh);
	}

	@DeleteMapping("/shipments")
	public void deleteShipments(int id) {
		shipmentService.deleteShipment(id);
	}
}
