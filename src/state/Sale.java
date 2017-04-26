package state;

import observer.Film;

public class Sale extends SaleState{

	@Override
	public void Handle(Film film) {
		// uchovanie stavu
		film.setSalestate(new NonSale());
	}

}
