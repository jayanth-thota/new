package com.cts.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.SectorDataFieldsRepository;

import com.cts.project.pojos.SectorDataFields;


@RestController
@RequestMapping("/SectorDataFields")
public class SectorDataFieldsController {
	@Autowired
	private SectorDataFieldsRepository sectordatafieldsrepository;
	@GetMapping
	public Iterable<SectorDataFields> getAllsectordatafields()
	{
		return sectordatafieldsrepository.findAll();
	}
	@PostMapping("/saveSectorDataFields")
	public SectorDataFields saveSectorDataFields(@RequestBody SectorDataFields sectordatafields)
	{
		System.out.println(sectordatafields);
		sectordatafieldsrepository.save(sectordatafields);
		
		return sectordatafields;
	}
	@PutMapping("/updateSectorDataFields/{id}")
	public SectorDataFields updateSectorDataFields(@RequestBody SectorDataFields sectordatafields,@PathVariable("id") String id)
{
sectordatafields.setId(id);
System.out.println(sectordatafields);
sectordatafieldsrepository.save(sectordatafields);
return sectordatafields;
}

}








