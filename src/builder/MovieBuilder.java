package builder;

import java.io.File;
import java.util.ArrayList;

public class MovieBuilder extends FilmBuilder {

	Movie m;

	public void build() {
		m = new Movie();
		m.setAudio(new ArrayList<File>());
		m.setSubtitle(new ArrayList<File>());
	}

	public Movie getresult() {
		return m;
	}
}
