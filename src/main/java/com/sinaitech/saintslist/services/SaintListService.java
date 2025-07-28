  package com.sinaitech.saintslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinaitech.saintslist.dto.SaintListDTO;
import com.sinaitech.saintslist.entities.SaintList;
import com.sinaitech.saintslist.repositories.SaintListRepository;


@Service
public class SaintListService {
	
	@Autowired
	private SaintListRepository saintListRepository;
	
	@Transactional(readOnly = true)
	public List<SaintListDTO> findAll() {
		List<SaintList> result = saintListRepository.findAll();
		return result.stream().map(x -> new SaintListDTO(x)).toList();
	}

}
