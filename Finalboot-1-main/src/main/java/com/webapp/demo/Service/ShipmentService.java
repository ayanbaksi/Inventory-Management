package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Shipment;

public interface ShipmentService {

	public List<Shipment> getShipment();

	public void setShipment(Shipment sh);

	public void editShipment(Shipment sh);

	public void deleteShipment(int id);
}
