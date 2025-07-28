package com.sinaitech.saintslist.dto;

import com.sinaitech.saintslist.entities.SaintList;

public class SaintListDTO {
	private Long id;
	private String name;
	
	public SaintListDTO() {
	}
	
	public SaintListDTO(SaintList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
