package com.covidAlert.covidAlertService.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidAlert.covidAlertService.model.AlertStatus;
import com.covidAlert.covidAlertService.model.StateData;
import com.covidAlert.covidAlertService.model.SummaryData;

@Service
public class AlertService {

	@Autowired
	private Covid19DataProvide dataProvider;

	public AlertStatus getAlertAboutState(String state) {
		// TODO Auto-generated method stub
		AlertStatus status = new AlertStatus();

		StateData statedata = dataProvider.getStateData(state);
		
		status.setStateData(statedata);

		if (statedata.getTotalConfirmed() < 1000) {
			status.setAlertLevel("GREEN");
			status.setMeasureToBeTaken(Arrays.asList("Everything is normal"));
		} else if (statedata.getTotalConfirmed() > 1000 && statedata.getTotalConfirmed() < 10000) {
			status.setAlertLevel("ORANGE");
			status.setMeasureToBeTaken(Arrays.asList("Only essentials service are allowed"));
		} else {
			status.setAlertLevel("RED");
			status.setMeasureToBeTaken(Arrays.asList("Complete LockDown"));
		}

		return status;
	}

	public SummaryData getOverAllSummary() {
		// TODO Auto-generated method stub
		return dataProvider.getOverAllSummary("summary");
	}

}
