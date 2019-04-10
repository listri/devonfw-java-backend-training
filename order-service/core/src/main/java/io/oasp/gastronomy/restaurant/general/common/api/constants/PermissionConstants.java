
package io.oasp.gastronomy.restaurant.general.common.api.constants;

import com.devonfw.module.security.common.api.accesscontrol.AccessControlPermission;

/**
 * Contains constants for the keys of all {@link AccessControlPermission
 * Permission}s.
 */
public abstract class PermissionConstants {

	/** {@link AccessControlPermission Permission} to find item. */
	public static final String FIND_ITEM = "FindItem";

	/** {@link AccessControlPermission Permission} to find items. */
	public static final String FIND_ITEMS = "FindItems";

	/** {@link AccessControlPermission Permission} to save item. */
	public static final String SAVE_ITEM = "SaveItem";

	/** {@link AccessControlPermission Permission} to delete item. */
	public static final String DELETE_ITEM = "DeleteItem";

}