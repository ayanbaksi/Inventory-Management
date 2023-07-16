package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Inventory;
import com.webapp.demo.Model.Product;
import com.webapp.demo.Model.PurchaseOrder;
import com.webapp.demo.Repository.Inventorydao;
import com.webapp.demo.Repository.Productdao;
import com.webapp.demo.Repository.Purchaseorderdao;

@Service
public class PurchaseOrdersServiceImpl implements PurchaseOrdersService {
	@Autowired
	Purchaseorderdao purchase;
	@Autowired
	Productdao product;

	@Autowired
	Inventorydao inven;

	@Override
	public List<PurchaseOrder> getPurchaseOrders() {

		return purchase.findAll();
	}

	@Override
	public void setPurchaseOrder(PurchaseOrder p) {
		Product p2 = product.findById(p.getProductId()).orElse(null);
        Inventory in=inven.findByProductId(p.getProductId());
		p2.setQuantity(p2.getQuantity() + p.getQuantity());
		in.setQuantity(in.getQuantity() + p.getQuantity());
		purchase.save(p);
        inven.save(in);
		product.save(p2);

	}

	@Override
	public void editPurchaseOrder(PurchaseOrder p) {
		Product p2 = product.findById(p.getProductId()).orElse(null);
		PurchaseOrder original = purchase.findById(p.getId()).orElse(null);
		p2.setQuantity(p2.getQuantity() - original.getQuantity() + p.getQuantity());
		purchase.save(p);
		product.save(p2);

	}

	@Override
	public void deletePurchaseOrder(int id) {
		purchase.deleteById(id);

	}

}
