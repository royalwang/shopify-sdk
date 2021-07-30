package com.shopify.model.structs;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

import com.shopify.model.adapters.DateTimeAdapter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyCustomer {

	private String id;
	private String email;
	@XmlElement(name = "accepts_marketing")
	private boolean acceptsMarketing;
	@XmlElement(name = "created_at")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime createdAt;
	@XmlElement(name = "updated_at")
	@XmlJavaTypeAdapter(DateTimeAdapter.class)
	private DateTime updatedAt;
	@XmlElement(name = "first_name")
	private String firstName;
	@XmlElement(name = "last_name")
	private String lastname;
	private String phone;
	@XmlElement(name = "orders_count")
	private long ordersCount;
	private String state;
	@XmlElement(name = "total_spent")
	private BigDecimal totalSpent;
	private String note;

	@XmlElement(name = "last_order_id")
	private long lastOrderId;
	@XmlElement(name = "verified_email")
	private boolean verifiedEmail;
	@XmlElement(name = "multipass_identifier")
	private String multipassIdentifier;
	@XmlElement(name = "tax_exempt")
	private boolean taxExempt;
	private String tags;
	@XmlElement(name = "last_order_name")
	private String lastOrderName;
	private Object metafield;
	private String currency;
	@XmlElement(name = "accepts_marketing_updated_at")
	private String acceptsMarketingUpdatedAt;
	@XmlElement(name = "marketing_opt_in_level")
	private String marketingOptInLevel;
	@XmlElement(name = "tax_exemptions")
	private List<String> taxExemptions;
//	private ShopifyDefaultAddress default_address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAcceptsMarketing() {
		return acceptsMarketing;
	}

	public void setAcceptsMarketing(boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(BigDecimal totalSpent) {
		this.totalSpent = totalSpent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "ShopifyCustomer{" +
				"id='" + id + '\'' +
				", email='" + email + '\'' +
				", acceptsMarketing=" + acceptsMarketing +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				", firstName='" + firstName + '\'' +
				", lastname='" + lastname + '\'' +
				", phone='" + phone + '\'' +
				", ordersCount=" + ordersCount +
				", state='" + state + '\'' +
				", totalSpent=" + totalSpent +
				", note='" + note + '\'' +
				'}';
	}
}
