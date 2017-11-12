package com.service.country.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.service.country.bean.WorldCountry;

@RestController
public class CountryController {

	
	static String fileName = "country.json";
	static Logger logger = Logger.getLogger(CountryController.class);
	static List<WorldCountry> countryList = new ArrayList<WorldCountry>();
	
	static {
		InputStream is =
				CountryController.class.getClassLoader().getResourceAsStream(fileName);
		Type listType = new TypeToken<List<WorldCountry>>() {}.getType();
		Reader targetReader = new InputStreamReader(is);
		countryList= new Gson().fromJson(targetReader, listType);
	}
	
	@RequestMapping(value = "/getCountry", method = RequestMethod.GET)
	public String getCountryDetails (@RequestParam String country) {
		logger.info("Service invoked for "+country+" at "+System.currentTimeMillis());
		WorldCountry returnCountry = null;
		if (null==country) {
			logger.info("Country not specified in GET");
			return "Specify country in argument";
		}
			
		if (countryList.isEmpty())
			logger.warn("No data in dataset");
		else {
			for (WorldCountry worldCounty : countryList) {
				if (worldCounty.getCountryName().equalsIgnoreCase(country)) {
					returnCountry = worldCounty;
				}
			}
		}
		logger.info("Request served for "+country+" at "+System.currentTimeMillis());
		return returnCountry.toString();
		
	}
}
