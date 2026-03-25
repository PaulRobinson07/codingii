periods = [[0,0,0,"Before School"],
	[7,29,59,"Period Zero"],
	[9,4,60,"Period One"],
	[9,9,59,"Passing Period"],
	[10,44,59,"Period Two"],
	[10,49,59,"Passing Period"],
	[12,24,59,"Period Three"],
	[13,4,59,"Lunch"],
	[13,9,59,"Passing Period"],
	[14,44,59,"Period Four"],
	[24,59,59,"After School"]];

//time school ends
end_of_day = [14,44,60];

class PeriodTracker {
	//runs on creation of class
	constructor(timerID,periodID,barID,endID) {
		//gets the html element from specified element id
		this.timerElement = document.getElementById(timerID);
		this.periodElement = document.getElementById(periodID);
		this.barElement = document.getElementById(barID);
		this.endElement = document.getElementById(endID);

		//variables that hold the current time
		this.timeHrs = 0;
		this.timeMin = 0;
		this.timeSec = 0;

		//variables that hold the time left in the period
		this.hrsLeft = 0;
		this.minLeft = 0;
		this.secLeft= 0;
		this.period = 0;
		this.lastper = -1;
	}

	//updates the time variables
	getCurrentTime() {
		let currentTime = new Date();
		this.timeHrs = currentTime.getHours();
		this.timeMin = currentTime.getMinutes();
		this.timeSec = currentTime.getSeconds();
	}

	//determines the current period
	getPeriod() {
		//loops over hours
		for (let i=0; i<periods.length;i++) {
			//checks if the checked hour is greater than the current time
			if (this.timeHrs<=periods[i][0]) {
				//loops over minutes
				for (let j=i;j<periods.length;j++) {
					//checks if the checked minute is greater than the current time
					if (this.timeMin<=periods[j][1]) {
						//returns the hour and stops the loop
						this.period = j;
						
						//code used to determine if the next period started
						if (this.lastper!=this.period) {
							if (this.lastper!=-1) {
								//draws confetti for making it to the next period
								for (i=0;i<50;i++) {
									squares[i] = new square();
								}
							}
							this.lastper = this.period;
						}
						return;
					}
				}
			}
		}
	}

	//sets the time of the html element by getting the time left in the class period
	setTime() {
		this.secLeft = Math.abs(periods[this.period][2]-this.timeSec);
		this.minLeft = Math.abs(periods[this.period][1]-this.timeMin);
		this.hrsLeft = Math.abs(periods[this.period][0]-this.timeHrs);
		this.timerElement.innerHTML = formatNum(this.hrsLeft)+":"+formatNum(this.minLeft)+":"+formatNum(this.secLeft);	
		this.periodElement.innerHTML = periods[this.period][3];

		//updates the end of the day counter
		let secLeft = Math.abs(end_of_day[2]-this.timeSec);
		let minLeft = Math.abs(end_of_day[1]-this.timeMin);
		let hrsLeft = Math.abs(end_of_day[0]-this.timeHrs);
		this.endElement.innerHTML = formatNum(hrsLeft)+":"+formatNum(minLeft)+":"+formatNum(secLeft);	
	}

	//updates the progress bar of time left
	updateProgressBar() {
		let secondsLeft = this.secLeft+this.minLeft*60+this.hrsLeft*3600;
		let p1 = periods[this.period][0]*3600+periods[this.period][1]*60+periods[this.period][2];
		let p2 = periods[this.period-1][0]*3600+periods[this.period-1][1]*60+periods[this.period-1][2];
		let progress = secondsLeft/(p1-p2);
		//updates the progress bar css
		this.barElement.style.width = 100-progress*100+"%";
	}

	//updates the tracker every frame
	update() {
		this.getCurrentTime();
		this.getPeriod();
		this.updateProgressBar();
		this.setTime();
	}
};

//makes a period tracker
periodTracker = new PeriodTracker("time_left","current_period","time_left_bar","time_left_day");

//runs every frame
function update() {
	//updates the tracker
	periodTracker.update();

	//requests another frame
	window.requestAnimationFrame(update);
}

//formats numbers to always be two digits
function formatNum(int) {
	if (int<=9) {
		return "0" + int.toString();
	}
	return int.toString();
}

//updates the tracker
update();
