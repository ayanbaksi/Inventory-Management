package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.BarcodeScanner;

public interface BarcodeScannerService {
	public List<BarcodeScanner> getBarcodeScanner();

	public void setBarcodeScanner(BarcodeScanner b);

	public void editBarcodeScanner(BarcodeScanner b);

	public void deleteBarcodeScanner(int id);
}
