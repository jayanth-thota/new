package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.StockExchangeDataFieldsRepository;

import com.cts.project.pojos.StockExchangeDataFields;


@RestController
@RequestMapping("/stockexchangedatafields")
public class StockExchangeDataFieldsController {
	@Autowired
	private StockExchangeDataFieldsRepository stockexchangedatafieldsRepository;
	@RequestMapping("/getAllstockexchangedatafields")
	public Iterable<StockExchangeDataFields>getAllstockexchangedatafields()
	{
		return stockexchangedatafieldsRepository.findAll();
	}
	@PostMapping("/saveStockExchangeDataFields")
	public  StockExchangeDataFields saveStockExchangeDataFields(@RequestBody  StockExchangeDataFields stockexchangedatafields)
	{
		System.out.println(stockexchangedatafields);
		stockexchangedatafieldsRepository.save(stockexchangedatafields);
		
		return stockexchangedatafields;
	}
	@PutMapping("/updateStockExchangeDataFields/{id}")
	public StockExchangeDataFields updateStockExchangeDataFields(@RequestBody StockExchangeDataFields stockexchangedatafields,@PathVariable("id") String id)
{
		stockexchangedatafields.setId(id);
System.out.println(stockexchangedatafields);
stockexchangedatafieldsRepository.save(stockexchangedatafields);
return stockexchangedatafields;
}

}


