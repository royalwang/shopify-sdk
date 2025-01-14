package com.shopify.model.request;

import com.shopify.model.structs.ShopifyVariant;

public interface ShopifyVariantRequest {

	public ShopifyVariant getRequest();

	public String getImageSource();

	public boolean hasImageSource();

	public boolean hasChanged();

}
