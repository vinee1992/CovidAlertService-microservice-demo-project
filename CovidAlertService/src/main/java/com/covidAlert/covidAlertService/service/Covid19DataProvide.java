package com.covidAlert.covidAlertService.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.covidAlert.covidAlertService.model.CovidApiData;
import com.covidAlert.covidAlertService.model.StateData;
import com.covidAlert.covidAlertService.model.SummaryData;

@Service
public class Covid19DataProvide {

	final String url = "https://api.rootnet.in/covid19-in/stats/latest";

	@Autowired
	RestTemplate rest;

	StateData getStateData(String state) {

		CovidApiData covidApiData = rest.getForObject(url, CovidApiData.class);

		return Arrays.stream(covidApiData.getData().getRegional()).filter(x -> state.equalsIgnoreCase(x.getLoc()))
				.findAny().orElse(new StateData());

	}

	public SummaryData getOverAllSummary(String string) {
		//TODO Auto-generated method stub

		CovidApiData covidApiData = rest.getForObject(url, CovidApiData.class);
		return covidApiData.getData().getSummary();
	}

	public CovidApiData getCovidCompleteData() {
		// TODO Auto-generated method stub
		return rest.getForObject(url, CovidApiData.class);
	}
}
