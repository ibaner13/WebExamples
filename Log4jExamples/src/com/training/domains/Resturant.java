package com.training.domains;

import java.util.*;

import org.apache.log4j.Logger;

public class Resturant {

	private List<FoodItem> items;

	Logger log = Logger.getRootLogger();

	public Resturant() {
		items = new ArrayList<FoodItem>();
		init();
	}

	public void init() {
		items.add(new FoodItem(101, "Shahi Paneer", 50.00, true));
		items.add(new FoodItem(201, "Chilli Chicken", 200.00, false));
		items.add(new FoodItem(202, "Fish Finger", 150.00, false));
		items.add(new FoodItem(102, "Malai Kofta", 100.00, true));

		log.info("Food Items");
	}

	public List<FoodItem> getItems(String type) {
		return null;
	}

	// public List<FoodItem> getMenuCard()
	public void getMenuCard() {
		int size = items.size();
		for (int i = 0; i < size; ++i)
			System.out.println(items.get(i).getItemCode() + "\t" + items.get(i).getItemName() + "\t"
					+ items.get(i).getRatePerUnit() + "\t" + items.get(i).isVegetarian());
		// return items;
	}

}
