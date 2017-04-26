package search;

import java.util.List;


public class SearchByYear extends Search
	{
		@Override
		public void handleSearch(List<String> searchlist)
		{
			if (searchlist.get(4)!= null)
			{           //if list contains year parameter handle search
				
				//Make search in database
			}
			 else if (m_successor != null)
		      {
				 m_successor.handleSearch(searchlist);
		}

		
	 }
	
	}


