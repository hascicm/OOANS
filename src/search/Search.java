package search;

import java.util.List;

public abstract class Search
{
	protected Search m_successor;
	public void setSuccessor(Search successor)
	{
		m_successor = successor;
	}

	public abstract void handleSearch(List<String> searchlist);

	public void klienkod(){
		
		
		// Vytvorenie chain of resposibility
	      Search h1 = new SearchByCategory();
	      Search h2 = new SearchByRating();
	      Search h3 = new SearchByTitle();
	      Search h4 = new SearchByYear();
	      h1.setSuccessor(h2);
	      h2.setSuccessor(h3);
	      h3.setSuccessor(h4);
	 
	      /*
	       * Po ziskani dat z aplikacie sa pre list parametrov spusti
	       * foreach cyklus v ktorom pre kazdy parameter bude zavolana 
	       * metoda h1.HandleSearch(parameter)
	       * */
		
	}

}
