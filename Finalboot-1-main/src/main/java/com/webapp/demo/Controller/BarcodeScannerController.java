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

import com.webapp.demo.Model.BarcodeScanner;

import com.webapp.demo.Service.BarcodeScannerService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class BarcodeScannerController {
	@Autowired
	BarcodeScannerService bcs;

	@PostMapping("/barcode-scanners")
	public void setBarcodeScanner(@RequestBody BarcodeScanner b) {
		bcs.setBarcodeScanner(b);
	}

	@ResponseBody
	@GetMapping("/barcode-scanners")
	public List<BarcodeScanner> getBarcodeScanner() {
		return bcs.getBarcodeScanner();
	}

	@PutMapping("/barcode-scanners")
	public void editBarcodeScanner(@RequestBody BarcodeScanner b) {
		bcs.editBarcodeScanner(b);
	}

	@DeleteMapping("/barcode-scanners")
	public void deleteBarcodeScanner(int id) {
		bcs.deleteBarcodeScanner(id);
	}
}
