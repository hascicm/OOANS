package state;

import observer.Film;

public class NonSale extends SaleState{

	@Override
	public void Handle(Film film) {
		//uchovanie stavu
		film.setSalestate(new Sale());
		
	}

}
