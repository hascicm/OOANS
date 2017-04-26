package search;

import java.util.List;

public class SearchByCategory extends Search
	{
		@Override
		public void handleSearch(List<String> searchlist)
		{
			if (searchlist.get(1)!= null)
			{           //if list contains category parameter handle search
				
				//Make search in database
			}
			 else if (m_successor != null)
		      {
				 m_successor.handleSearch(searchlist);
		}

		
	 }
}
