package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.domain.Pageable;

import com.devonfw.app.java.order.orderservice.dataaccess.api.CustomerEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.CustomerSearchCriteriaTo;;

@SpringBootTest( webEnvironment = WebEnvironment.DEFINED_PORT)
public class CustomerRepositoryTest {

	 @Inject
	  private CustomerRepository customerRepository;

}
