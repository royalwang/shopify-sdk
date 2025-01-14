package com.shopify.model.roots;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.shopify.model.request.ShopifyOrderShippingAddressUpdateRequest;

import javax.xml.bind.annotation.XmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class ShopifyOrderUpdateRoot {

	private ShopifyOrderShippingAddressUpdateRequest order;

	public ShopifyOrderShippingAddressUpdateRequest getOrder() {
		return order;
	}

	public void setOrder(final ShopifyOrderShippingAddressUpdateRequest order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ShopifyOrderUpdateRoot{" +
				"order=" + order +
				'}';
	}
}
