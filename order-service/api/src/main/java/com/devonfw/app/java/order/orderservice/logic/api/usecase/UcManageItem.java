package com.devonfw.app.java.order.orderservice.logic.api.usecase;

import org.springframework.data.domain.Page;

import com.devonfw.app.java.order.general.logic.api.to.ItemSearchCriteriaTo;
import com.devonfw.app.java.order.orderservice.logic.api.to.ItemEto;

public interface UcManageItem {

	/**
	 * Deletes a item from the database by its id 'itemId'.
	 *
	 * @param itemId Id of the item to delete
	 * @return boolean <code>true</code> if the item can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteItem(long itemId);

	/**
	 * Saves a item and store it in the database.
	 *
	 * @param item the {@link ItemEto} to create.
	 * @return the new {@link ItemEto} that has been saved with ID and version.
	 */
	ItemEto saveItem(ItemEto item);

	boolean increasePrice(ItemEto item);

}
