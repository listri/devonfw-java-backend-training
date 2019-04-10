package com.devonfw.app.java.order.orderservice.common.api;

import java.time.LocalDate;

import com.devonfw.app.java.order.general.common.api.ApplicationEntity;

public interface Order extends ApplicationEntity {

	/**
	 * @return priceId
	 */

	public Double getPrice();

	/**
	 * @param price setter for price attribute
	 */

	public void setPrice(Double price);


	/**
	 * @return creationDateId
	 */

	public LocalDate getCreationDate();

	/**
	 * @param creationDate setter for creationDate attribute
	 */

	public void setCreationDate(LocalDate creationDate);

	/**
	 * @return statusId
	 */

	public String getStatus();

	/**
	 * @param status setter for status attribute
	 */

	public void setStatus(String status);

}
