package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import java.time.LocalDate;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderEntity;
import com.devonfw.module.test.common.base.ComponentTest;

@SpringBootTest( webEnvironment = WebEnvironment.DEFINED_PORT)
public class OrderRepositoryTest extends ComponentTest{

	@Inject
	private OrderRepository orderRepository;

	@Test
	public void shouldFindOrdersWithGivenDateAndStatus() {
		// when
		LocalDate date = LocalDate.of(2019, 03, 15);
		String status = "SERVED"; // CaseSensitive!
		List<OrderEntity> orders = orderRepository.findByFromSpecificDateAndStatus(date, status);

		// then
		assertThat(orders).hasSize(1);
	}
}
