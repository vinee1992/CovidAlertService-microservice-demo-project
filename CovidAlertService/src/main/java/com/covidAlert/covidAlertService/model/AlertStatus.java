package com.covidAlert.covidAlertService.model;

import java.util.List;

public class AlertStatus {

	String alertLevel;// red,green orange

	List<String> measureToBeTaken;

	private StateData StateData;

	public StateData getStateData() {
		return StateData;
	}

	public void setStateData(StateData stateData) {
		StateData = stateData;
	}

	public String getAlertLevel() {
		return alertLevel;
	}

	public void setAlertLevel(String alertLevel) {
		this.alertLevel = alertLevel;
	}

	public List<String> getMeasureToBeTaken() {
		return measureToBeTaken;
	}

	public void setMeasureToBeTaken(List<String> measureToBeTaken) {
		this.measureToBeTaken = measureToBeTaken;
	}

}
