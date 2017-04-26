package observer;

import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import state.SaleState;
import visitor.FilmVisitor;

public abstract class Film implements FilmSubject {
	private List<File> audio;
	private List<File> subtitle;
	private File video;
	private double price;
	private String title;
	private String category;
	private Date year;
	private List<PriceObserver> observers;
	private SaleState salestate;

	public SaleState getSalestate() {
		return salestate;
	}

	public void setSalestate(SaleState salestate) {
		this.salestate = salestate;
	}

	public void Request() {
		salestate.Handle(this);
	}

	public void atach(PriceObserver o) {
		observers.add(o);
	}

	public void detach(PriceObserver o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (PriceObserver o : observers) {
			o.update();
		}
	}

	public void accept(FilmVisitor v) {
		v.visitfilm(this);
		// zmenenie stavu salestate, kontrola ci je v zlave atd.
	}

}
