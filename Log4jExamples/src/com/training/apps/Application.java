package com.training.apps;

import org.apache.log4j.Logger;

import com.training.domains.Resturant;

public class Application {

	public static void main(String[] args) {

		Logger log = Logger.getRootLogger();
		log.info("Starting Application");
		Resturant resObj = new Resturant();
		resObj.getMenuCard();
		log.info("Done bye..");

	}

}
