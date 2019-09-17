package com.bharath.fligthregistration.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{

	private Boolean checkedIn;
	private int numberOFBags;
	@OneToOne
	private Passanger passanger;
	@OneToOne
	private Flight flight;
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOFBags() {
		return numberOFBags;
	}
	public void setNumberOFBags(int numberOFBags) {
		this.numberOFBags = numberOFBags;
	}
	public Passanger getPassanger() {
		return passanger;
	}
	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
}
