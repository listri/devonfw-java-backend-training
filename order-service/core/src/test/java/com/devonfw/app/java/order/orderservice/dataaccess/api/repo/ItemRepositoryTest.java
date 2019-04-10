package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;

import com.devonfw.app.java.order.general.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.module.basic.common.api.query.LikePatternSyntax;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;
import com.devonfw.module.test.common.base.ComponentTest;

@SpringBootTest( webEnvironment = WebEnvironment.DEFINED_PORT)
public class ItemRepositoryTest extends ComponentTest {

	@Inject
	private ItemRepository itemRepository;

	@Test
	public void shouldFindAllItems() {
	    // when
	    List<ItemEntity> foundItems = itemRepository.findAll();

	    // then
	    assertThat(foundItems).hasSize(3);
	 }

	@Test
	public void shouldFindEntitiesWhereNameIsGiven() {
		// when
		Pageable pageable = PageRequest.of(0, 10, Sort.Direction.ASC, "name");
		ItemSearchCriteriaTo criteria = new ItemSearchCriteriaTo();
		StringSearchConfigTo descriptionOption = new StringSearchConfigTo();
		descriptionOption.setIgnoreCase(true);
		descriptionOption.setLikeSyntax(LikePatternSyntax.SQL);
		criteria.setDescriptionOption(descriptionOption);
		criteria.setDescription("%i%");
		criteria.setPageable(pageable);
		Page<ItemEntity> items = itemRepository.findByCriteria(criteria);
		List<ItemEntity> foundItems = items.getContent();

		// then
		assertThat(foundItems).hasSize(3);
	}
}
