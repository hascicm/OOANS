package memento;



abstract class Purchase
	  {
	
		//memento
	    private String state;
	 

	    public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		// Vytvorenie mementa
	    public PurchaseMemento CreateMemento()
	    {
	      return (new PurchaseMemento(state));
	    }
	 
	    // Obnovenie povodneho stavu
	    public void SetMemento(PurchaseMemento memento)
	    {
	    	/*
	    	 * tu sa udeje obnovenie stavu
	    	 * */
	      
	      state = memento.getState();
	    }
	    // template method
	    public abstract void setExpiration();
 		public abstract void savePayment();
	   
	      
	      public void TemplateMethod()
	      {
	    	  setExpiration();
	    	  savePayment();
	      }
	    
	  /* Klientska aplikacia na zaklade sposobu nadobudnutia filmu zavola potrebne metody
	   * napr. Purchase p = new Rent();
	   * 		p.setExpiration();
	   * Tym sa na zaklade parametrov nastavi ako dlho bude mat user film k dispozicii.*/
	  
	  }
