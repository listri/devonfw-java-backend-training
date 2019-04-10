package com.devonfw.app.java.order.orderservice.logic.api.to;

import java.time.LocalDate;

import com.devonfw.app.java.order.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.app.java.order.orderservice.common.api.Order}s.
 */
public class OrderSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private Double price;

	private LocalDate creationDate;

	private String status;

	private Long ownerId;

	private StringSearchConfigTo statusOption;

	/**
	 * @return priceId
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price setter for price attribute
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return creationDateId
	 */
	public LocalDate getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate setter for creationDate attribute
	 */
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return statusId
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status setter for status attribute
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * getter for ownerId attribute
	 *
	 * @return ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param owner setter for owner attribute
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getStatus() status}.
	 */
	public StringSearchConfigTo getStatusOption() {

		return this.statusOption;
	}

	/**
	 * @param statusOption new value of {@link #getStatusOption()}.
	 */
	public void setStatusOption(StringSearchConfigTo statusOption) {

		this.statusOption = statusOption;
	}

}
