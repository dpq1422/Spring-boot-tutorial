package com.dpq.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dpq.rest.services.CountryService;
import com.dpq.rest.vo.Country;

@RestController
public class CountryController {
	CountryService countryService = new CountryService();
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountry(@PathVariable int id) {
		return countryService.getCountry(id);
	}
	
	@RequestMapping(value = "/country", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}
	
	@RequestMapping(value = "/country", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCountry(@RequestBody Country country) {
		countryService.updateCountry(country);
	}
	
	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable int id) {
		countryService.deleteCountry(id);
	}
	
}
