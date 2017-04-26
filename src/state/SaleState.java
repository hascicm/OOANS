package state;

import observer.Film;

public abstract class SaleState {
	
	private int creditValue;
	
	public int getCreditValue() {
		return creditValue;
	}
	
	public void setCreditValue(int creditValue) {
		this.creditValue = creditValue;
	}
	
	public abstract void Handle(Film film);
}
