package com.shopify.model.roots;

import com.shopify.model.Metafield;

import java.util.LinkedList;
import java.util.List;

public class MetafieldsRoot {

	private List<Metafield> metafields = new LinkedList<>();

	public List<Metafield> getMetafields() {
		return metafields;
	}

	public void setMetafields(List<Metafield> metafields) {
		this.metafields = metafields;
	}

}