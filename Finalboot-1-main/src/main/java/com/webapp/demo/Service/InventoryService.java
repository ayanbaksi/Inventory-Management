package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Inventory;

public interface InventoryService {
	public List<Inventory> getInventory();

	public void saveInInventory(Inventory i);

	public void editInInventory(Inventory i);

	public void deleteInInventory(int id);
}
