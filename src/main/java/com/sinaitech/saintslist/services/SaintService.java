  package com.sinaitech.saintslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinaitech.saintslist.dto.SaintDTO;
import com.sinaitech.saintslist.dto.SaintMinDTO;
import com.sinaitech.saintslist.entities.Saint;
import com.sinaitech.saintslist.repositories.SaintRepository;


@Service
public class SaintService {
	
	@Autowired
	private SaintRepository saintRepository;
	
	@Transactional(readOnly = true)
	public List<SaintMinDTO> findAll() {
		List<Saint> result = saintRepository.findAll();
		return result.stream().map(x -> new SaintMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public SaintDTO findById(Long id) {
		Saint result = saintRepository.findById(id).get();
		SaintDTO dto = new SaintDTO(result);
		return dto;
	}
}
