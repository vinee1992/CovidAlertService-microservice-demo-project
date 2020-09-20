package com.covidAlert.covidAlertService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.covidAlert.covidAlertService.model.AlertStatus;
import com.covidAlert.covidAlertService.model.SummaryData;
import com.covidAlert.covidAlertService.service.AlertService;

@RestController
public class CovidAlertControler {

	@Autowired
	AlertService service;

	@GetMapping("/india/{state}")
	AlertStatus getAlertAboutState(@PathVariable String state) {

		return service.getAlertAboutState(state);

	}
	
	
	@GetMapping("/india/summary")
	SummaryData getOverAllSummary() {

		return service.getOverAllSummary();

	}
}
