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

import com.webapp.demo.Model.Product;
import com.webapp.demo.Repository.Productdao;
import com.webapp.demo.Service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService product;

	@Autowired
	Productdao dao;

	@PostMapping("/products")
	public void product(@RequestBody Product p) {
		product.saveProduct(p);
	}

	@ResponseBody
	@GetMapping("/products")
	public List<Product> getpro() {
		return product.getProducts();
	}

	@GetMapping("/total")
	public int total() {
		return product.getTotalQuantity();
	}

	@GetMapping("/totalert")
	public int totalert() {
		return dao.getAlertQuantity();
	}

	@GetMapping("/productsless")
	public List<Product> getProductsByQuantityLessThanSix() {
		return product.getProductsByQuantityLessThanSix();
	}

	@PutMapping("/products")
	public void putpro(@RequestBody Product p) {
		product.editProduct(p);
	}

	@DeleteMapping("/products")
	public void detpro(int id) {
		product.deleteProduct(id);
	}

	@GetMapping("/pg")
	public int pg(String barcode) {
		return dao.findIdByBarcode(barcode);
	}

}
