package application;

import java.time.LocalTime;

public class Time {
	
	
	protected LocalTime startTime;
	protected LocalTime intervalTime;
	protected LocalTime finishTime;
//	private final LocalTime;
//	Consider array to store each interval
	
	public Time() {
		
	}
	
	public Time(LocalTime startTime, LocalTime intervalTime, LocalTime finishTime) {
		this.startTime = startTime;
		this.intervalTime = intervalTime;
		this.finishTime = finishTime;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(LocalTime intervalTime) {
		this.intervalTime = intervalTime;
	}

	public LocalTime getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(LocalTime finishTime) {
		this.finishTime = finishTime;
	}
	
}
