package com.devonfw.app.java.order.orderservice.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.devonfw.app.java.order.general.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.dataaccess.api.ItemEntity;
import com.devonfw.app.java.order.orderservice.dataaccess.api.OrderEntity;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;
import com.devonfw.app.java.order.orderservice.logic.api.to.OrderEto;
import com.devonfw.app.java.order.orderservice.logic.api.usecase.UcManageItem;
import com.devonfw.app.java.order.orderservice.logic.base.usecase.AbstractItemUc;

@Named
@Validated
@Transactional
public class UcManageItemImpl extends AbstractItemUc implements UcManageItem {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcManageOrderImpl.class);

	@Override
	public boolean deleteItem(long itemId) {

		ItemEntity order = getItemRepository().find(itemId);
		getItemRepository().delete(order);
		LOG.debug("The item with id '{}' has been deleted.", itemId);
		return true;
	}

	@Override
	public ItemEto saveItem(ItemEto item) {

		Objects.requireNonNull(item, "item");

		ItemEntity itemEntity = getBeanMapper().map(item, ItemEntity.class);

		// initialize, validate orderEntity here if necessary
		ItemEntity resultEntity = getItemRepository().save(itemEntity);
		LOG.debug("Order with id '{}' has been created.", resultEntity.getId());
		return getBeanMapper().map(resultEntity, ItemEto.class);
	}

	@Override
	public boolean increasePrice(ItemEto item) {

		item.setPrice(item.getPrice() + 10);
		return true;
	}

}
