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

import com.webapp.demo.Model.Sale;

import com.webapp.demo.Service.SalesService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SalesController {

	@Autowired
	SalesService sale;

	@PostMapping("/sales")
	public void setSales(@RequestBody Sale s) {

		sale.setSales(s);

	}

	@ResponseBody
	@GetMapping("/sales")
	public List<Sale> getSales() {
		return sale.getSales();
	}

	@PutMapping("/sales")
	public void putSales(@RequestBody Sale s) {
		sale.editSales(s);
	}

	@DeleteMapping("/sales")
	public void delSales(int id) {
		sale.deleteSales(id);
	}
}
