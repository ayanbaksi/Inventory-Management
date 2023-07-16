package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Product;
import com.webapp.demo.Model.Shipment;
import com.webapp.demo.Repository.Productdao;
import com.webapp.demo.Repository.Shipmentdao;

@Service

public class ShipmentServiceImpl implements ShipmentService {
	@Autowired
	Shipmentdao shipment;

	@Autowired
	Productdao product;

	@Override
	public List<Shipment> getShipment() {
		// TODO Auto-generated method stub
		return shipment.findAll();
	}

	@Override
	public void setShipment(Shipment sh) {
		Product p2 = product.findById(sh.getProductId()).orElse(null);
		p2.setQuantity(p2.getQuantity() - sh.getQuantity());
		shipment.save(sh);
		product.save(p2);

	}

	@Override
	public void editShipment(Shipment sh) {
		Shipment originalShipment = shipment.findById(sh.getId()).orElse(null);
		Product p2 = product.findById(sh.getProductId()).orElse(null);
		p2.setQuantity(p2.getQuantity() + originalShipment.getQuantity() - sh.getQuantity());
		shipment.save(sh);
		product.save(p2);

	}

	@Override
	public void deleteShipment(int id) {
		shipment.deleteById(id);

	}
}
