package com.devonfw.app.java.order.orderservice.dataaccess.api;

import java.beans.Transient;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.devonfw.app.java.order.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.app.java.order.orderservice.common.api.Order;

@Entity(name = "OrderSummary")
public class OrderEntity extends ApplicationPersistenceEntity implements Order {

	private Double price;

	private LocalDate creationDate;

	private String status;

	private Set<ItemEntity> orderPositions;

	private CustomerEntity owner;

	private static final long serialVersionUID = 1L;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@ManyToMany
	@JoinTable(name = "OrderPosition", joinColumns = @JoinColumn(name = "orderId", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "itemId", referencedColumnName = "id"))
	public Set<ItemEntity> getOderPositions() {
		return orderPositions;
	}

	public void setOderPositions(Set<ItemEntity> orderPositions) {
		this.orderPositions = orderPositions;
	}

	@ManyToOne
	@JoinColumn(name = "ownerId")
	public CustomerEntity getOwner() {
		return owner;
	}

	public void setOwner(CustomerEntity owner) {
		this.owner = owner;
	}

}
