package com.webapp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.BarcodeScanner;
import com.webapp.demo.Repository.Barcodescannerdao;

@Service
public class BarcodeScannerServiceImpl implements BarcodeScannerService {
	@Autowired
	Barcodescannerdao barcode;

	@Override
	public List<BarcodeScanner> getBarcodeScanner() {
		// TODO Auto-generated method stub
		return barcode.findAll();
	}

	@Override
	public void setBarcodeScanner(BarcodeScanner b) {
		barcode.save(b);

	}

	@Override
	public void editBarcodeScanner(BarcodeScanner b) {
		barcode.save(b);

	}

	@Override
	public void deleteBarcodeScanner(int id) {
		barcode.deleteById(id);

	}
}
