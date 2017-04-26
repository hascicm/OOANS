package bridge;

import java.nio.Buffer;

public class DesktopPlayer extends Player {

	public DesktopPlayer(Stream s) {
		super(s);
		// vytvorenie prehravaca
	}

	@Override
	public void Play() {
		s.stremData();
		// praca so streamom dat
	}

}
