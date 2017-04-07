package com.example.ManyToMany;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "product_property_map")
public class ProductPropertyMap implements Serializable {

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "property_id")
	private Property property;

	@Column(name = "modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public ProductPropertyMap() {

	}

	public ProductPropertyMap(Product product, Property property, Date modifiedDate) {
		this.product = product;
		this.property = property;
		this.modifiedDate = modifiedDate;
	}

}
