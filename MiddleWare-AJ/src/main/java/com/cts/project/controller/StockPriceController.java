package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.StockPriceRepository;

import com.cts.project.pojos.StockPrice;

@RestController
@RequestMapping("/stockprice")
public class StockPriceController {
	@Autowired
	private StockPriceRepository stockpriceRepository;
	@RequestMapping("/getAllstockprice")
	public Iterable<StockPrice>getAllstockprice()
	{
		return stockpriceRepository.findAll();
	}
	@PostMapping("/saveStockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice)
	{
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		
		return stockprice;
	}
	@PutMapping("/updateStockPrice/{companycode}")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,@PathVariable("companycode") String companycode)
{
		stockprice.setCompanycode(companycode);
System.out.println(stockprice);
stockpriceRepository.save(stockprice);
return stockprice;
}

}


