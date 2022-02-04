package com.coderscampus.assignment10.dto;

public class Week {

	private DailyResponse monday;
	private DailyResponse tuesday;
	private DailyResponse wednesday;
	private DailyResponse thursday;
	private DailyResponse friday;
	private DailyResponse saturday;
	private DailyResponse sunday;

	public DailyResponse getMonday() {
		return monday;
	}

	public void setMonday(DailyResponse monday) {
		this.monday = monday;
	}

	public DailyResponse getTuesday() {
		return tuesday;
	}

	public void setTuesday(DailyResponse tuesday) {
		this.tuesday = tuesday;
	}

	public DailyResponse getWednesday() {
		return wednesday;
	}

	public void setWednesday(DailyResponse wednesday) {
		this.wednesday = wednesday;
	}

	public DailyResponse getThursday() {
		return thursday;
	}

	public void setThursday(DailyResponse thursday) {
		this.thursday = thursday;
	}

	public DailyResponse getFriday() {
		return friday;
	}

	public void setFriday(DailyResponse friday) {
		this.friday = friday;
	}

	public DailyResponse getSaturday() {
		return saturday;
	}

	public void setSaturday(DailyResponse saturday) {
		this.saturday = saturday;
	}

	public DailyResponse getSunday() {
		return sunday;
	}

	public void setSunday(DailyResponse sunday) {
		this.sunday = sunday;
	}

}
