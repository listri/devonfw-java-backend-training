package com.devonfw.app.java.order.common.builders;

import java.util.LinkedList;
import java.util.List;

import com.devonfw.app.java.order.orderservice.logic.api.to.CustomerEto;

/**
 * Test data builder for CustomerEto generated with cobigen.
 */
public class CustomerEtoBuilder {

	private List<P<CustomerEto>> parameterToBeApplied;

	/**
	 * The constructor.
	 */
	public CustomerEtoBuilder() {

		this.parameterToBeApplied = new LinkedList<>();
		fillMandatoryFields();
		fillMandatoryFields_custom();
	}

	/**
	 * @param firstName the firstName to add.
	 * @return the builder for fluent population of fields.
	 */
	public CustomerEtoBuilder firstName(final String firstName) {
		this.parameterToBeApplied.add(new P<CustomerEto>() {
			@Override
			public void apply(CustomerEto target) {
				target.setFirstName(firstName);
			}
		});
		return this;
	}

	/**
	 * @param lastName the lastName to add.
	 * @return the builder for fluent population of fields.
	 */
	public CustomerEtoBuilder lastName(final String lastName) {
		this.parameterToBeApplied.add(new P<CustomerEto>() {
			@Override
			public void apply(CustomerEto target) {
				target.setLastName(lastName);
			}
		});
		return this;
	}

	/**
	 * @return the populated CustomerEto.
	 */
	public CustomerEto createNew() {
		CustomerEto customereto = new CustomerEto();
		for (P<CustomerEto> parameter : parameterToBeApplied) {
			parameter.apply(customereto);
		}
		return customereto;
	}

	/**
	 * Might be enriched to users needs (will not be overwritten)
	 */
	private void fillMandatoryFields_custom() {

	}

	/**
	 * Fills all mandatory fields by default. (will be overwritten on re-generation)
	 */
	private void fillMandatoryFields() {
	}

}
