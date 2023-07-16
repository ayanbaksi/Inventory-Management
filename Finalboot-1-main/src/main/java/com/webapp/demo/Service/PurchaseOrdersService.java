package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.PurchaseOrder;

public interface PurchaseOrdersService {
	public List<PurchaseOrder> getPurchaseOrders();

	public void setPurchaseOrder(PurchaseOrder p);

	public void editPurchaseOrder(PurchaseOrder p);

	public void deletePurchaseOrder(int id);
}
