package com.cts.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.IposRepository;

import com.cts.project.pojos.Ipos;


@RestController
@RequestMapping("/IPOS")
public class IposController {
	@Autowired
	private IposRepository iposRepository;
	@GetMapping
	public Iterable<Ipos>getAllipos()
	{
		return iposRepository.findAll();
	}
	@PostMapping("/saveIPOS")
	public Ipos saveIpos(@RequestBody Ipos ipos)
	{
		System.out.println(ipos);
		iposRepository.save(ipos);
		
		return ipos;
	}
	@PutMapping("/updateIPOS/{id}")
	public Ipos updateIpos(@RequestBody Ipos ipos,@PathVariable("id") String id)
{
ipos.setId(id);
System.out.println(ipos);
iposRepository.save(ipos);
return ipos;
}

}


