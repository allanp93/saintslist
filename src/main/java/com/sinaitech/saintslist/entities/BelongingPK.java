package com.sinaitech.saintslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "saint_id")
	private Saint saint;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private SaintList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Saint saint, SaintList list) {
		super();
		this.saint = saint;
		this.list = list;
	}

	public Saint getSaint() {
		return saint;
	}

	public void setSaint(Saint saint) {
		this.saint = saint;
	}

	public SaintList getList() {
		return list;
	}

	public void setList(SaintList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list, saint);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(list, other.list) && Objects.equals(saint, other.saint);
	}
	
	

}
