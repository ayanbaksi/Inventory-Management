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

import com.webapp.demo.Model.PurchaseOrder;
import com.webapp.demo.Repository.Purchaseorderdao;
import com.webapp.demo.Service.PurchaseOrdersService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Purchase_OrdersController {

	@Autowired
	PurchaseOrdersService pos;

	@Autowired
	Purchaseorderdao doas;

	@PostMapping("/purchase-orders")
	public void setPurchaseOrder(@RequestBody PurchaseOrder p) {
		pos.setPurchaseOrder(p);
	}

	@ResponseBody
	@GetMapping("/purchase-orders")
	public List<PurchaseOrder> getPurchaseOrder() {
		return pos.getPurchaseOrders();
	}

	@PutMapping("/purchase-orders")
	public void editPurchaseOrder(@RequestBody PurchaseOrder p) {
		pos.editPurchaseOrder(p);
	}

	@DeleteMapping("/purchase-orders")
	public void delPurchaseOrder(int id) {
		pos.deletePurchaseOrder(id);
	}

	@PostMapping("/purchase-orderss")
	public void setPurchaseOrders(@RequestBody PurchaseOrder p) {
		doas.save(p);
	}

}
