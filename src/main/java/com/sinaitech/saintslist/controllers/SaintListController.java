package com.sinaitech.saintslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinaitech.saintslist.dto.SaintListDTO;
import com.sinaitech.saintslist.services.SaintListService;


@RestController
@RequestMapping(value = "/lists")
public class SaintListController {
	@Autowired
	private SaintListService saintListService;
	
	@GetMapping
	public List<SaintListDTO> findAll() {		
		List<SaintListDTO> result = saintListService.findAll();
		return result;
	}
	
}
