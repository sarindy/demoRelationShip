package com.example.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "property")
	private List<ProductPropertyMap> productPropertyMap;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductPropertyMap> getProductPropertyMap() {
		return productPropertyMap;
	}

	public void setProductPropertyMap(List<ProductPropertyMap> productPropertyMap) {
		this.productPropertyMap = productPropertyMap;
	}

	public Property() {

	}

	public Property(String name, List<ProductPropertyMap> productPropertyMap) {

		this.name = name;
		this.productPropertyMap = productPropertyMap;
	}

	public Property(String name) {
		
		this.name = name;
	}
	
	

}
