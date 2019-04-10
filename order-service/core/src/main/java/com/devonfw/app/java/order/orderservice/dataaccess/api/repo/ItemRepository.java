package com.devonfw.app.java.order.orderservice.dataaccess.api.repo;

import org.springframework.data.domain.Page;

import static com.querydsl.core.alias.Alias.$;
import com.devonfw.app.java.order.general.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

public interface ItemRepository extends DefaultRepository<ItemEntity> {

	default Page<ItemEntity> findByCriteria(ItemSearchCriteriaTo criteria) {

		ItemEntity alias = newDslAlias();
		JPAQuery<ItemEntity> query = newDslQuery(alias);

		String name = criteria.getName();
		if (name != null && !name.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getName()), name, criteria.getNameOption());
		}

		String description = criteria.getDescription();
		if (description != null && !description.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getDescription()), description, criteria.getDescriptionOption());
		}

		Double price = criteria.getPrice();
		if (price != null) {
			query.where($(alias.getPrice()).eq(price));
		}

		return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
	}
}
