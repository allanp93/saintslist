package com.sinaitech.saintslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinaitech.saintslist.entities.Saint;

public interface SaintRepository extends JpaRepository<Saint, Long> {
	
}
