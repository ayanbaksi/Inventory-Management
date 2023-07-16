package com.webapp.demo.Controller;

import java.time.LocalDate;
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

import com.webapp.demo.Model.Inventory;
import com.webapp.demo.Repository.Inventorydao;
import com.webapp.demo.Service.InventoryService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class InventoryController {
	@Autowired
	InventoryService inventoryService;

	@Autowired
	Inventorydao in;

	@PostMapping("/inventory")
	public void postInventory(@RequestBody Inventory i) {
		inventoryService.saveInInventory(i);
	}

	@ResponseBody
	@GetMapping("/inventory")
	public List<Inventory> getInventory() {
		return inventoryService.getInventory();
	}

	@PutMapping("/inventory")
	public void putinv(@RequestBody Inventory i) {
		inventoryService.editInInventory(i);
	}

	@DeleteMapping("/inventory")
	public void delinv(int id) {
		inventoryService.deleteInInventory(id);
	}

	@DeleteMapping("/del")
	public void deleteOldDates() {
		LocalDate cutoffDate = LocalDate.now().minusDays(90);
		in.deleteByDateBefore(cutoffDate);
	}

}
