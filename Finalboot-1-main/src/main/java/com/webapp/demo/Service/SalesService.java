package com.webapp.demo.Service;

import java.util.List;

import com.webapp.demo.Model.Sale;

public interface SalesService {
	public List<Sale> getSales();

	public void setSales(Sale s);

	public void editSales(Sale s);

	public void deleteSales(int id);
}
