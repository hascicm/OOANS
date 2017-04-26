package builder;

import java.io.File;
import java.util.ArrayList;

public class SeriesBuilder extends FilmBuilder{
	Series s;

	public void build() {
		s = new Series();
		s.setAudio(new ArrayList<File>());
		s.setSubtitle(new ArrayList<File>());
	}

	public Series getresult() {
		return s;
	}
}
