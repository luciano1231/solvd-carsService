package com.solvd.carsService.enumTask;

public enum RideStatus {
		NOTHING ("No current trip"),
		WAITING("Waiting for the driver"),
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



