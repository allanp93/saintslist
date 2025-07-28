package com.sinaitech.saintslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinaitech.saintslist.dto.SaintDTO;
import com.sinaitech.saintslist.dto.SaintMinDTO;
import com.sinaitech.saintslist.services.SaintService;


@RestController
@RequestMapping(value = "/saints")
public class SaintController {
	@Autowired
	private SaintService saintService;
	
	@GetMapping
	public List<SaintMinDTO> findAll() {		
		List<SaintMinDTO> result = saintService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public SaintDTO findByID(@PathVariable Long id) {		
		SaintDTO result = saintService.findById(id);
		return result;
	}
}
