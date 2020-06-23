package com.solvd.carsService.enumTask;

public enum RideStatus {
		NOTHING ("No current trip"),
		AVAILABLE ("Taxi available"),
		WAITING("Please Wait for your driver"),
		FINISHED("Arrived to destination");

		private String st;

		private RideStatus(String st) {
			this.setSt(st);
		}

		public String getSt() {

			return st;
		}

		public void setSt(String st) {

			this.st = st;
		}


	}



