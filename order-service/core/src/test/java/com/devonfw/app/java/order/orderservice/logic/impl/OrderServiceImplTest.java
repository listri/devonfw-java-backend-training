package com.devonfw.app.java.order.orderservice.logic.impl;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.devonfw.app.java.order.orderservice.logic.api.Orderservice;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageItem;
import com.devonfw.module.test.common.base.ComponentTest;

@Transactional
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class OrderServiceImplTest extends ComponentTest {

	@Inject
	private Orderservice orderService;

	@Test
	public void shouldIncreasePriceSpecificItem() {
		// when
		ItemEto itemEto = orderService.findItem(21);
		boolean result = orderService.increasePrice(itemEto);
		orderService.saveItem(itemEto);
		double priceAfter = itemEto.getPrice();

		//then
		assertThat(result).isTrue();
		assertThat(priceAfter).isEqualTo(260);
	}
}
