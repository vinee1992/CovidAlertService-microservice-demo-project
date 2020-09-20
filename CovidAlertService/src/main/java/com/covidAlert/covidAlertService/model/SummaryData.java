package com.covidAlert.covidAlertService.model;

import java.time.ZonedDateTime;

public class SummaryData {

	int total;
	int confirmedCasesIndian;
	int confirmedCasesForeign;
	int discharged;
	int eaths;
	int confirmedButLocationUnidentified;

	ZonedDateTime lastRefreshed;
	ZonedDateTime lastOriginUpdate;

	public ZonedDateTime getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(ZonedDateTime lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public ZonedDateTime getLastOriginUpdate() {
		return lastOriginUpdate;
	}

	public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}

	public void setConfirmedCasesIndian(int confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}

	public int getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}

	public void setConfirmedCasesForeign(int confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}

	public int getDischarged() {
		return discharged;
	}

	public void setDischarged(int discharged) {
		this.discharged = discharged;
	}

	public int getEaths() {
		return eaths;
	}

	public void setEaths(int eaths) {
		this.eaths = eaths;
	}

	public int getConfirmedButLocationUnidentified() {
		return confirmedButLocationUnidentified;
	}

	public void setConfirmedButLocationUnidentified(int confirmedButLocationUnidentified) {
		this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
	}

}
