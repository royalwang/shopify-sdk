package com.shopify.model.roots;

import com.shopify.model.structs.ShopifyRecurringApplicationCharge;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyRecurringApplicationChargeRoot {

	@XmlElement(name = "recurring_application_charge")
	private ShopifyRecurringApplicationCharge recurringApplicationCharge;

	public ShopifyRecurringApplicationCharge getRecurringApplicationCharge() {
		return recurringApplicationCharge;
	}

	public void setRecurringApplicationCharge(ShopifyRecurringApplicationCharge recurringApplicationCharge) {
		this.recurringApplicationCharge = recurringApplicationCharge;
	}

}
