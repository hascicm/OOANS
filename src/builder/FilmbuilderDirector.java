package builder;

public class FilmbuilderDirector {

	FilmBuilder builder;

	public FilmbuilderDirector(MovieBuilder obj) {
		builder = obj;
	}

	public FilmbuilderDirector(SeriesBuilder obj) {
		builder = obj;
	}

	void buildFilmObject(boolean movie) {
		builder.build();

	}
}
