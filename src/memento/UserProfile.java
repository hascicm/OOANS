package memento;

import main.Library;

public class UserProfile {

	private int id;
	private String email;
	private String username;
	private int credit;
	private Library lib;
	
	private PurchaseMemento memento;
	
	// getter a setter pre memento
	public PurchaseMemento getMemento() {
		return memento;
	}

	public void setMemento(PurchaseMemento memento) {
		this.memento = memento;
	}
	 
	    
	    
	  }

