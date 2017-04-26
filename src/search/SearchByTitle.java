package search;

import java.util.List;


public class SearchByTitle extends Search
	{
		@Override
		public void handleSearch(List<String> searchlist)
		{
			if (searchlist.get(3)!= null)
			{           //if list contains title parameter handle search
				
				//Make search in database
			}
			 else if (m_successor != null)
		      {
				 m_successor.handleSearch(searchlist);
		}

		
	 }
}
