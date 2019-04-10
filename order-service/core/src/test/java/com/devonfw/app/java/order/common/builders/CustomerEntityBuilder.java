package com.devonfw.app.java.order.common.builders;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderEntity;

/**
 * Test data builder for CustomerEntity generated with cobigen.
 */
public class CustomerEntityBuilder {

	private List<P<CustomerEntity>> parameterToBeApplied;

	/**
	 * The constructor.
	 */
	public CustomerEntityBuilder() {

		this.parameterToBeApplied = new LinkedList<>();
		fillMandatoryFields();
		fillMandatoryFields_custom();
	}

	/**
	 * @param orders the orders to add.
	 * @return the builder for fluent population of fields.
	 */
	public CustomerEntityBuilder orders(final Set<OrderEntity> orders) {
		this.parameterToBeApplied.add(new P<CustomerEntity>() {
			@Override
			public void apply(CustomerEntity target) {
				target.setOrders(orders);
			}
		});
		return this;
	}

	/**
	 * @param firstName the firstName to add.
	 * @return the builder for fluent population of fields.
	 */
	public CustomerEntityBuilder firstName(final String firstName) {
		this.parameterToBeApplied.add(new P<CustomerEntity>() {
			@Override
			public void apply(CustomerEntity target) {
				target.setFirstName(firstName);
			}
		});
		return this;
	}

	/**
	 * @param lastName the lastName to add.
	 * @return the builder for fluent population of fields.
	 */
	public CustomerEntityBuilder lastName(final String lastName) {
		this.parameterToBeApplied.add(new P<CustomerEntity>() {
			@Override
			public void apply(CustomerEntity target) {
				target.setLastName(lastName);
			}
		});
		return this;
	}

	/**
	 * @return the populated CustomerEntity.
	 */
	public CustomerEntity createNew() {
		CustomerEntity customerentity = new CustomerEntity();
		for (P<CustomerEntity> parameter : parameterToBeApplied) {
			parameter.apply(customerentity);
		}
		return customerentity;
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
