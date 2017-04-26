package search;

import java.util.List;


public class SearchByRating extends Search
	{
		@Override
		public void handleSearch(List<String> searchlist)
		{
			if (searchlist.get(2)!= null)
			{           //if list contains rating parameter handle search
				
				//Make search in database
			}
			 else if (m_successor != null)
		      {
				 m_successor.handleSearch(searchlist);
		}

		
	 }
}

