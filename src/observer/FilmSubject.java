package observer;

public interface FilmSubject {

	void atach(PriceObserver o);

	void detach(PriceObserver o);

	void notifyObservers();
}
