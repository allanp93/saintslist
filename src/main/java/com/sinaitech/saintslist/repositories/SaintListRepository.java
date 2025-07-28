package com.sinaitech.saintslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinaitech.saintslist.entities.SaintList;

public interface SaintListRepository extends JpaRepository<SaintList, Long> {
	
}
