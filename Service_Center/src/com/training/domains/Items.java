package com.training.domains;

import org.springframework.stereotype.Component;

@Component("item")
public class Items {

	private int itemId;
	private String itemType;
	private String itemName;

	public Items() {
		super();
	}

	public Items(int itemId, String itemType, String itemName) {
		super();
		this.itemId = itemId;
		this.itemType = itemType;
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Items [Item Id: " + itemId + ", Item Type: " + itemType + ", Item Name: " + itemName + "]";
	}

}
